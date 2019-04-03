/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn;

import pl.maciejwasiak.magazyn.Items.Item;

import java.time.ZonedDateTime;

public interface RoomInterface {
    void insert(Item item);

    void remove(Item item);
    void remove();

    void rent(Person person, int howManyDays, ZonedDateTime dateOfRent);

    void leave();
}
