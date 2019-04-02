/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import pl.maciejwasiak.magazyn.Items.Car;
import pl.maciejwasiak.magazyn.Items.Motorcycle;

import java.time.ZonedDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Jan", "Kowalski", "Zlota 9, 01-61, Warszawa", "11-06-1998", "9800000000");
        System.out.println(p);

        Warehouse w = new Warehouse(456.56f, 5);
        System.out.println(w);

        List<Room> listOfRooms = new ArrayList<>();

        listOfRooms.add(new Room(500, 500, 200));
        listOfRooms.add(new Room(500, 500, 200));
        for (Room r : listOfRooms) {
            r.rent(p, 30, ZonedDateTime.now());
            System.out.println(r);
        }

        for (Room r : listOfRooms) {
            r.leave();
            System.out.println(r);
        }

        Motorcycle[] tab = new Motorcycle[2];
        Motorcycle cbr125 = new Motorcycle("Honda", 125, "Petrol", true, false, 200f, 200f, 50f);
        Motorcycle cbr250 = new Motorcycle("SzybszaNizWyglada", 250, "Petrol", true, false, 200f, 200f, 50f);
        tab[0] = cbr125;
        tab[1] = cbr250;

        Car[] tabOfCars = new Car[2];
        Car bmw = new Car("e39", 3000, "petrol", 50000, true, false);
        Car bmw1 = new Car("e36", 3000, "petrol", 50000, true, false);



    }
}
