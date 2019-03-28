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
        final StringBuilder sb = new StringBuilder("Warehouse{");
        sb.append("surface=").append(surface);
        sb.append(", numberOfRooms=").append(numberOfRooms);
        sb.append('}');
        return sb.toString();
    }
}
