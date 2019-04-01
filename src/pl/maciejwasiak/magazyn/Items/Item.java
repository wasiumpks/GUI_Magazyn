/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

import pl.maciejwasiak.magazyn.RoomInterface;

public abstract class Item implements Comparable {
    float volumeOfItem;
    boolean isFoldable;


    @Override
    public int compareTo(Object o) {
        return 0;
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

}
