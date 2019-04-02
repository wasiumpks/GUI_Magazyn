/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

import java.util.Comparator;

public abstract class Item implements Comparator<Item>, Comparable<Item> {
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

    public float getxDimension() { return xDimension; }

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

    //zrobic dwa po nazwie i po volume
    @Override
    public int compare(Item o1, Item o2) {
        return (o1.getName().compareTo(o2.getName()));
    }

    @Override
    public int compareTo(Item o) {
        if (getName().toLowerCase().compareTo(o.getName().toLowerCase()) == 0) {
            return 0;
        } else if (getName().toLowerCase().compareTo(o.getName().toLowerCase()) > 0) {
            return 1;
        } else if (getName().toLowerCase().compareTo(o.getName().toLowerCase()) < 0) {
            return -1;
        }
        return 0;
    }
}
