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
        Person p = new Person("Jan", "Kowalski", "Zlota 9, 01-61, Warszawa", "11-06-1998");
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
        //tring fuelType, int volumeOfItem, boolean approval, boolean isFoldable)
        Car bmw = new Car("e39", 3000, "petrol", 50000, true, false);
        Car bmw1 = new Car("e36", 3000, "petrol", 50000, true, false);

        Arrays.sort(tabOfCars);


//        Scanner keyboard = new Scanner(System.in);
//        int hotkey = -1;
//
//        do {
//            System.out.println("Witamy na aplikacji zarzadzania magazynem: \n" + "[0] Aby wyjsc z aplikacji \n" + "[1] Dla menu kienta \n" + "[2] Dla menu pracownika");
//            do {
//                hotkey = keyboard.nextInt();
//                if (hotkey == 1) // klient menu
//                {
//                    System.out.println("Jestes wlasnie w menu klienta: \n" + "[0] Aby wyjsc z aplikacji \n" + "[1] Informacje o uzytkowniku \n" + "[2] Wybierz pokoj \n");
//                    do {
//                        hotkey = keyboard.nextInt();
//                        if (hotkey == 1) // dane osobowe
//                        {
//                            do {
//                                hotkey = keyboard.nextInt();
//                                if (hotkey == 1) {
//                                    System.out.println("1");
//                                } else if (hotkey == 2) {
//                                    System.out.println("2");
//                                } else if (hotkey == 0) {
//                                    break;
//                                } else
//                                    System.out.println("Wprowadz poprawna opcje");
//                                hotkey = -1;
//                            } while (hotkey != 0);
//                        } else if (hotkey == 2) // wybierz pokoj
//                        {
//                            System.out.println("wybierz pokoj");
//                            do {
//                                System.out.println("Jestes w wyborze pokoi: \n" + "[0] Aby wyjsc z aplikacji \n" + "[1] Wloz przedmiot \n" + "[2] Wyjmij przedmiot \n" +
//                                        "[3] Wynajmij pokoj \n" + "[4] Przedluz wynajem \n" + "[5] Przedluz wynajem \n" + "[6] Stan magazynu");
//                                hotkey = keyboard.nextInt();
//                                if (hotkey == 1) // wloz przedmiot
//                                {
//                                    System.out.println("wloz przedmiot");
//                                } else if (hotkey == 2) // wyjmij przedmiot
//                                {
//                                    System.out.println("wyjmij przedmiot");
//                                } else if (hotkey == 3) // wynajmij pokoj
//                                {
//                                    System.out.println("wynajmij pokoj");
//                                } else if (hotkey == 4) // przedluz wynajem
//                                {
//                                    System.out.println("przedluz wynajem");
//                                } else if (hotkey == 5) // pokaz wolne pomieszczenie
//                                {
//                                    System.out.println("pokaz wolne pokoje");
//                                } else if (hotkey == 6) // wypisz stan magazynu do txt
//                                {
//                                    System.out.println("stan magazynu");
//                                } else if (hotkey == 0) {
//                                    break;
//                                } else
//                                    System.out.println("Wprowadz poprawna opcje");
//                                hotkey = -1;
//                            } while (hotkey != 0);
//                            hotkey = -1;
//                        } else if (hotkey == 0) {
//                            break;
//                        } else {
//                            System.out.println("Wprowadz poprawna opcje");
//                            hotkey = -1;
//                        }
//                    } while (hotkey != 0);
//                    hotkey = -1;
//                } else if (hotkey == 2) // pracownik menu
//                {
//                    System.out.println("Menu pracownika: \n" + "[0] Aby wyjsc z aplikacji \n" + "[1] Wyswietl liste pracownikow \n" +
//                            "[2] Wyswietl status magazynow \n" + "[3] Wyswietl liste wszystkich przedmiotow");
//                    do {
//                        hotkey = keyboard.nextInt();
//                        if (hotkey == 1) // lista pracownikow
//                        {
//                            System.out.println("Wybierz dokladna grupe: \n" + "[0] Aby wyjsc z aplikacji \n" + "[1] Brygadzisci \n" + "[2] Pracownicy");
//                            do {
//                                hotkey = keyboard.nextInt();
//                                if (hotkey == 1) // brygadzisci
//                                {
//                                    System.out.println("Oto twoja lista wszystkich brygadzistow: \n");
//                                } else if (hotkey == 2) // pracownicy magazynu
//                                {
//                                    System.out.println("Oto twoja lista wszystkich pracownikow: \n");
//                                } else if (hotkey == 0) {
//                                    break;
//                                } else
//                                    System.out.println("Wprowadz poprawna opcje");
//                                hotkey = -1;
//                            } while (hotkey != 0);
//                            hotkey = -1;
//                        } else if (hotkey == 2) // magazyny
//                        {
//                            System.out.println("magazyn");
//                            do {
//                                hotkey = keyboard.nextInt();
//                                if (hotkey == 1) // sprawdz status magazynu
//                                {
//                                    System.out.println("pokaz status magazynu");
//                                } else if (hotkey == 2) // oproznij magazyn
//                                {
//                                    System.out.println("oproznij magazyn");
//                                } else if (hotkey == 3) // zmien status magazynu
//                                {
//                                    System.out.println("zmien status magazynu");
//                                } else if (hotkey == 4) // zamknij/otworz magazyn
//                                {
//                                    System.out.println("zamknij/otworz magazyn");
//                                } else if (hotkey == 0) {
//                                    break;
//                                } else
//                                    System.out.println("Wprowadz poprawna opcje");
//                                hotkey = -1;
//                            } while (hotkey != 0);
//                            hotkey = -1;
//                        } else if (hotkey == 3) // pokaz liste wszystkich przedmiotow
//                        {
//                            System.out.println("pokaz liste all itemow");
//                        } else if (hotkey == 0) {
//                            break;
//                        } else
//                            System.out.println("Wprowadz poprawna opcje");
//                        hotkey = -1;
//                    } while (hotkey != 0);
//                    hotkey = -1;
//                } else if (hotkey == 0) {
//                    break;
//                } else {
//                    System.out.println("Wprowadz poprawna opcje");
//                    hotkey = -1;
//                }
//                while (hotkey != 0) ;
//                hotkey = -1;
//            } while (hotkey != 0);
//            hotkey = -1;
//        } while (hotkey != 0);

    }
}
