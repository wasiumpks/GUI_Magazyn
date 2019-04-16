/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

import java.util.Comparator;

public abstract class Item implements Comparable<Item> {
    private static int id = 0;
    private int itemID = 0;
    float volumeOfItem, xDimension, yDimension, zDimension;
    boolean isFoldable;
    String name;

    public Item() {
        this.itemID = id++;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

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

    SortByVolume<Item> sortByVolume = new SortByVolume<>();
    public static Comparator<Item> sortujPoNazwie = Comparator.comparing(o -> o.name);

    @Override
    public int compareTo(Item o) {
        if (this.volumeOfItem - o.volumeOfItem == 0) {
            if (this.name.toLowerCase().compareTo(o.name.toLowerCase()) == 0) {
                return 0;
            } else {
                return this.name.toLowerCase().compareTo(o.name);
            }
        } else {
            return (int) (this.volumeOfItem - o.volumeOfItem);
        }
    }

    @Override
    public String toString() {
        return "Przedmiot: " +
                " Nazwa" + name +
                " objetosc: " + volumeOfItem +
                ", wymiar x: " + xDimension +
                ", wymiar y: " + yDimension +
                ", wymiar z: " + zDimension +
                ", czy jest skladany: " + isFoldable;
    }
}
