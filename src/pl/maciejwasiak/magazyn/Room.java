/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import java.time.ZonedDateTime;
import java.util.List;

public class Room implements RentInterface {
    private static int id = 0;
    private int roomId, howManyDays;
    private float xDimension, yDimension, zDimension, volume, freeSpace;
    private String causeOfExclusion;
    private boolean isInUse, isForRent;
    private Person renter;
    private ZonedDateTime rentDate, leaveDate;
    private List list;

    public Room(float xDimension, float yDimension, float zDimension) {
        this.roomId = id++;
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.zDimension = zDimension;
        this.renter = null;
        this.isForRent = true;

        //calculating volume of room based on room dimensions
        this.volume = (xDimension * yDimension * zDimension) / 100;
    }

    public Room(float volume) {
        this.roomId = id++;
        this.renter = null;
        this.volume = volume;
        this.isForRent = true;

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Room.id = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public float getxDimension() {
        return xDimension;
    }

    public void setxDimension(float xDimension) {
        this.xDimension = xDimension;
    }

    public float getyDimension() {
        return yDimension;
    }

    public void setyDimension(float yDimension) {
        this.yDimension = yDimension;
    }

    public float getzDimension() {
        return zDimension;
    }

    public void setzDimension(float zDimension) {
        this.zDimension = zDimension;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getCauseOfExclusion() {
        return causeOfExclusion;
    }

    public void setCauseOfExclusion(String causeOfExclusion) {
        this.causeOfExclusion = causeOfExclusion;
    }


    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }

    public Person getRenter() {
        return renter;
    }

    public void setRenter(Person renter) {
        this.renter = renter;
    }

    public int getHowManyDays() {
        return howManyDays;
    }

    public void setHowManyDays(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    public ZonedDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(ZonedDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public ZonedDateTime getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(ZonedDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    public float getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(float freeSpace) {
        this.freeSpace = freeSpace;
    }

    public boolean isForRent() {
        return isForRent;
    }

    public void setForRent(boolean forRent) {
        isForRent = forRent;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", howManyDays=" + howManyDays +
                ", xDimension=" + xDimension +
                ", yDimension=" + yDimension +
                ", zDimension=" + zDimension +
                ", volume=" + volume +
                ", freeSpace=" + freeSpace +
                ", causeOfExclusion='" + causeOfExclusion + '\'' +
                ", isInUse=" + isInUse +
                ", isForRent=" + isForRent +
                ", renter=" + renter +
                ", rentDate=" + rentDate +
                ", leaveDate=" + leaveDate +
                '}';
    }

    @Override
    public void rent(Person person, int howManyDays, ZonedDateTime dateOfRent) {
        if (isForRent) {
            this.renter = person;
            this.howManyDays = howManyDays;
            this.rentDate = dateOfRent;
            this.isInUse = true;
            this.isForRent = false;
            if (person.getHowManyRents() == 0) {
                person.setDateOfFirstRent(dateOfRent);
            }
            person.setHowManyRents(person.getHowManyRents() + 1);
        } else {
            System.out.println("Pomieszczenie nie jest na wynajem!" + getCauseOfExclusion());
        }
    }

    @Override
    public void leave() {
        this.leaveDate = ZonedDateTime.now();
        this.rentDate = null;
        this.howManyDays = 0;
        this.isInUse = false;
        this.isForRent = true;
        this.renter = null;

    }
}
