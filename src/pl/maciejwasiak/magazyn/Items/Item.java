/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

import java.util.Comparator;

public abstract class Item implements Comparable<Item> {
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

    public static Comparator<Item> sortujPoPowierzchni = (o1, o2) -> (int) (o1.volumeOfItem - o2.volumeOfItem);
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
}
