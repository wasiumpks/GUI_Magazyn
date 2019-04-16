/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn.Items;

import java.util.Comparator;

public class SortByVolume<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Item i1 = (Item) o1;
        Item i2 = (Item) o2;
        return (int) (((Item) o1).getVolumeOfItem() - ((Item) o2).getVolumeOfItem());
    }
}
