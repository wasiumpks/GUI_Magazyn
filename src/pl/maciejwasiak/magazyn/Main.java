/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Jan", "Kowalski", "Zlota 9, 01-61, Warszawa", "11-06-1998");
        System.out.println(p);

        Warehouse w = new Warehouse(456.56f, 5);
        System.out.println(w);

        List<Room> listOfRooms = new ArrayList<>();

        listOfRooms.add(new Room(500, 500, 200));
        listOfRooms.add(new Room(500, 500, 200));
        for (Room r : listOfRooms) {
            r.setRentier(p);
            System.out.println(r);
        }


    }
}
