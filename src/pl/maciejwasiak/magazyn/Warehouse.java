/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

public class Warehouse {
    private float surface;
    private int numberOfRooms;

    public Warehouse(float surface, int numberOfRooms) {
        this.surface = surface;
        this.numberOfRooms = numberOfRooms;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "surface=" + surface +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
