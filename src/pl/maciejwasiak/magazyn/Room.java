/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import pl.maciejwasiak.magazyn.Exceptions.TooManyItemsException;
import pl.maciejwasiak.magazyn.Items.Item;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Room implements RoomInterface {
    private static int id = 0;
    private int roomId, howManyDays;
    private float xDimension, yDimension, zDimension, volume, freeVolume;
    private String causeOfExclusion;
    private boolean isInUse, isForRent;
    private Person renter;
    private ZonedDateTime rentDate, leaveDate;
    private List<Item> list;
    private Map<Person, Room> mapOfRoomsAndPersons;

    public Room() {
    }

    public Room(float xDimension, float yDimension, float zDimension) {
        this.roomId = id++;
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.zDimension = zDimension;
        this.renter = null;
        this.isForRent = true;
        //calculating volume of room based on room dimensions
        this.volume = (xDimension * yDimension * zDimension) / 100;
        this.freeVolume = volume;
        this.list = new ArrayList<>();
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

    public float getFreeVolume() {
        return freeVolume;
    }

    public void setFreeVolume(float freeVolume) {
        this.freeVolume = freeVolume;
    }

    public boolean isForRent() {
        return isForRent;
    }

    public void setForRent(boolean forRent) {
        isForRent = forRent;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }

    @Override
    public void insert(Item item) {
        if (freeVolume >= item.getVolumeOfItem()) {
            list.add(item);
            this.freeVolume = this.freeVolume - item.getVolumeOfItem();
        } else {
            try {
                throw new TooManyItemsException("Nie ma miejsca!");
            } catch (TooManyItemsException e) {
                e.printStackTrace();
            }
        }
    }

    public void move(Person p, List<Item> list) {
        float freeVolumeOfRoom = 0;
        float volumeOfItems = 0;

        for (Item item : list) {
            volumeOfItems += item.getVolumeOfItem();
        }

        for (int i = 0; i < p.getRooms().size(); i++) {
            Room pokoj = p.getRooms().get(i);
            freeVolumeOfRoom += pokoj.getFreeVolume();
            if (freeVolumeOfRoom >= volumeOfItems) {
                System.out.println("Przenosze przedmioty!");
                for (Item item : list) {
                    pokoj.insert(item);
                }
                System.out.println("Przedmioty przeniesione!");
                break;
            } else {
                if (i == p.getRooms().size() - 1) {
                    System.out.println("Nie przeniesiono przedmiotow, brak miejsca!");
                    list.clear();
                    System.out.println("Przedmioty zostały usnięte!");

                } else
                    System.out.println("W tym pokoju nie ma wystarczajaco miejsca!\n Sprawdzam kolejny");
            }
        }
    }

    @Override
    public void remove(Item item) {
        list.remove(item);
        this.freeVolume = this.freeVolume + item.getVolumeOfItem();

    }

    @Override
    public void remove() {
        list.clear();
        this.freeVolume = this.volume;

    }

    @Override
    public void rent(Person person, int howManyDays, ZonedDateTime dateOfRent) {
        if (isForRent) {
            person.getRooms().add(this);
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

    @Override
    public String toString() {
        return "Pokoj: \n" +
                " Id: " + roomId +
                ",\n Wynajety na: " + howManyDays + " dni" +
                ",\n Wymiar x: " + xDimension +
                ",\n Wymiar y: " + yDimension +
                ",\n Wymiar z: " + zDimension +
                ",\n Objetosc: " + volume +
                ",\n Wolna objetosc: " + freeVolume +
                ",\n Powod wylaczenia pokoju " + causeOfExclusion +
                ",\n Czy jest w użyciu: " + isInUse +
                ",\n Czy jest na wynajem: " + isForRent +
                ",\n Najemca: " + renter +
                ",\n Data wynajmu: " + rentDate +
                ",\n Data opuszczenia: " + leaveDate +
                ",\n Lista przedmiotow w pomieszczeniu: " + list;
    }
}
