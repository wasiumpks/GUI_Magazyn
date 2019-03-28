/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

public class Room {
    private static int id = 0;
    private int roomId, timeOfRent;
    private float xDimension, yDimension, zDimension, volume;
    private String causeOfExclusion, dateOfRent;
    private boolean isInUse;
    private Person rentier;

    public Room(float xDimension, float yDimension, float zDimension) {
        this.roomId = id++;
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.zDimension = zDimension;
        this.rentier = null;

        //calculating volume of room based on room dimensions
        this.volume = (xDimension * yDimension * zDimension) / 100;
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

    public int getTimeOfRent() {
        return timeOfRent;
    }

    public void setTimeOfRent(int timeOfRent) {
        this.timeOfRent = timeOfRent;
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

    public String getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }

    public Person getRentier() {
        return rentier;
    }

    public void setRentier(Person rentier) {
        this.rentier = rentier;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("roomId=").append(roomId);
        sb.append(", timeOfRent=").append(timeOfRent);
        sb.append(", xDimension=").append(xDimension);
        sb.append(", yDimension=").append(yDimension);
        sb.append(", zDimension=").append(zDimension);
        sb.append(", volume=").append(volume);
        sb.append(", causeOfExclusion='").append(causeOfExclusion).append('\'');
        sb.append(", dateOfRent='").append(dateOfRent).append('\'');
        sb.append(", isInUse=").append(isInUse);
        sb.append(", rentier=").append(rentier);
        sb.append('}');
        return sb.toString();
    }
}
