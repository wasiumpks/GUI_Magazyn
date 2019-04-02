/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

import pl.maciejwasiak.magazyn.RoomInterface;

import java.util.Comparator;

public abstract class Item implements Comparable<Item>, RoomInterface {
    float volumeOfItem, xDimension, yDimension, zDimension;
    boolean isFoldable;
    String name;

    public float getVolumeOfItem() {
        return volumeOfItem;
    }

    public void setVolumeOfItem(float volumeOfItem) {
        this.volumeOfItem = volumeOfItem;
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public void setFoldable(boolean foldable) {
        isFoldable = foldable;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fold() {
        //objetosc sie nie zmienia, dlugosc sie skraca o polowe a szerokosc sie zwieksza.
        this.xDimension = this.xDimension / 2;
        this.yDimension = this.yDimension * 2;
    }

    //zrobic dwa po nazwie i po volume
    @Override
    public int compareTo(Item o) {

        if (this.getName().toLowerCase().compareTo(o.getName().toLowerCase()) == 0) {
            return 0;
        } else if (this.getName().toLowerCase().compareTo(o.getName().toLowerCase()) > 0) {
            return 1;
        } else if (this.getName().toLowerCase().compareTo(o.getName().toLowerCase()) < 0) {
            return -1;
        }
        return 0;
    }

    public static Comparator<Item> CompareByName = (o1, o2) -> ((o1.getName().toLowerCase()).compareTo(o2.getName()));

    @Override
    public void remove() {

    }

    @Override
    public void put() {

    }
}
