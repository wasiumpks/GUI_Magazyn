/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import pl.maciejwasiak.magazyn.Items.*;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> listOfPersons = new ArrayList<>();
        List<Room> listOfRooms = new ArrayList<>();
        List<Item> listOfItems = new ArrayList<>();

        Warehouse w1 = new Warehouse(10);
        Room r1 = new Room(10, 10, 3);
        Room r2 = new Room(10, 5, 3);
        Room r3 = new Room(10, 10, 3);
        Room r4 = new Room(10, 17, 3);
        Room r5 = new Room(10, 10, 3);
        Room r6 = new Room(200, 20, 3);
        Room r7 = new Room(10, 10, 3);
        Room r8 = new Room(7, 8, 3);
        Room r9 = new Room(19, 7, 3);
        Room r10 = new Room(10, 13, 3);

        Person p1 = new Person("Jan", "Kowalski", "Bursztynowa 14, Warszawa", "10-10-1998", "98101001011");
        Person p2 = new Person("Jakub", "Wozniak", "Rajmuda Klocka 69, Warszawa", "12-12-1999", "98110101011");
        Person p3 = new Person("Feliks", "Kowalski", "Bursztynowa 14, Warszawa", "10-10-1980", "80101001011");
        Person p4 = new Person("Kornelia", "Kowalska", "Bursztynowa 14, Warszawa", "03-03-1982", "92030301011");
        Person p5 = new Person("Patryk", "Grzeszczak", "Kasztanowa 53A, Warszawa", "10-03-1998", "98031001011");
        Person p6 = new Person("Tomasz", "Michałowski", "Wiejska 3, Warszawa", "01-01-1991", "91010101011");

        Bicycle b1 = new Bicycle("Trek Domane ALR5", 10, "Hydrauliczne", 0, false, 2.5f, 1f, 0.3f);
        Bicycle b2 = new Bicycle("Trek Domane ALR6", 11, "Zaciskowe", 0, false, 2.5f, 1f, 0.3f);
        Bicycle b3 = new Bicycle("Trek Procaliber", 12, "Hydrauliczne", 1, false, 3f, 1f, 0.5f);
        Bicycle b4 = new Bicycle("Kreidler Stud Carbon", 11, "Hydrauliczne", 1, false, 3f, 1.2f, 0.6f);
        Bicycle b5 = new Bicycle("Wigry 3", 1, "Zaciskowe", 0, true, 2f, 0.5f, 0.4f);

        Car c1 = new Car("BMW", 3000, FuelType.LPG, true, false, 5f, 2f, 3.5f);
        Car c2 = new Car("Jaguar", 5000, FuelType.PETROL, true, false, 6f, 2f, 4f);
        Car c3 = new Car("Citroen", 1200, FuelType.DIESEL, false, false, 3f, 1.8f, 3f);
        Car c4 = new Car("Honda", 2000, FuelType.DIESEL, true, false, 5f, 2f, 3.5f);
        Car c5 = new Car("VW", 3600, FuelType.PETROL, true, false, 5.5f, 2f, 4f);

        Motorcycle m1 = new Motorcycle("Yamaha", 1200, FuelType.PETROL, true, false, 1.5f, 1f, 0.6f);
        Motorcycle m2 = new Motorcycle("Honda", 1000, FuelType.PETROL, true, false, 1.5f, 1f, 0.6f);
        Motorcycle m3 = new Motorcycle("KTM", 650, FuelType.PETROL, true, false, 1.5f, 1f, 0.6f);
        Motorcycle m4 = new Motorcycle("Suzuki", 1200, FuelType.PETROL, true, false, 1.5f, 1f, 0.6f);
        Motorcycle m5 = new Motorcycle("Yamaha", 125, FuelType.PETROL, true, false, 1.5f, 1f, 0.6f);

        LawnMower l1 = new LawnMower("Gardena", 2, FuelType.ELECTRIC, true, 1f, 1f, 0.6f);
        LawnMower l2 = new LawnMower("NEC", 200, FuelType.PETROL, true, 1f, 1f, 0.6f);
        LawnMower l3 = new LawnMower("KOSIARKA ELEKTRYCZNA", 2, FuelType.ELECTRIC, true, 1f, 1f, 0.6f);
        LawnMower l4 = new LawnMower("KOSIARKA SPALINOWA", 150, FuelType.PETROL, true, 1f, 1f, 0.6f);
        LawnMower l5 = new LawnMower("KOSIARKA KOSIARKA SPALINOWA", 300, FuelType.PETROL, true, 1f, 1f, 0.6f);

        listOfPersons.add(p1);
        listOfPersons.add(p2);
        listOfPersons.add(p3);
        listOfPersons.add(p4);
        listOfPersons.add(p5);
        listOfPersons.add(p6);

        listOfRooms.add(r1);
        listOfRooms.add(r2);
        listOfRooms.add(r3);
        listOfRooms.add(r4);
        listOfRooms.add(r5);
        listOfRooms.add(r6);
        listOfRooms.add(r7);
        listOfRooms.add(r8);
        listOfRooms.add(r9);
        listOfRooms.add(r10);

        listOfItems.add(b1);
        listOfItems.add(b2);
        listOfItems.add(b3);
        listOfItems.add(b4);
        listOfItems.add(b5);
        listOfItems.add(c1);
        listOfItems.add(c2);
        listOfItems.add(c3);
        listOfItems.add(c4);
        listOfItems.add(c5);
        listOfItems.add(m1);
        listOfItems.add(m2);
        listOfItems.add(m3);
        listOfItems.add(m4);
        listOfItems.add(m5);
        listOfItems.add(l1);
        listOfItems.add(l2);
        listOfItems.add(l3);
        listOfItems.add(l4);
        listOfItems.add(l5);

        Person choosingPerson = null;
        Room rentingRoom = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Program do obsługi magazynu\nProjekt na przedmiot GUI\nAutor: Maciej Wasiak\n\n");
        int operationKey = -1;
        while (operationKey != 0) {
            System.out.println("Zarzadzanie magazynem: \nwybierz 0 aby wyjsc z aplikacji\nwybierz 1 aby wybrac osobe\nwybierz 2 aby zarzadzac pomieszczeniami\nwybierz 3 aby zapisac stan magazynu");
            operationKey = input.nextInt();
            switch (operationKey) {
                case 0:
                    break;
                case 1:
                    System.out.println("Lista osob\n");
                    choosingPerson = Main.choosePerson(listOfPersons);

                    System.out.println("Informacje o osobie:\n");
                    System.out.println(choosingPerson.toString());
                    break;
                case 2:
                    System.out.println("wybierz 0 aby wyjsc\nwybierz 1 aby wynajac pomieszczenie\nwybierz 2 aby wyswietlic szczegoly pomieszczenia\nwybierz 3 aby opuscic pokoj");
                    int tmp = input.nextInt();
                    switch (tmp) {
                        case 1:
                            rentingRoom = Main.chooseRoom(listOfRooms);
                            choosingPerson = Main.choosePerson(listOfPersons);
                            System.out.println("Na jak długo chcesz wynajac:");
                            int forHowmanyDaysRent = input.nextInt();
                            rentingRoom.rent(choosingPerson, forHowmanyDaysRent, ZonedDateTime.now());
                            break;
                        case 3:
                            Person leavingPerson = null;
                            leavingPerson = Main.choosePerson(listOfPersons);
                            Room leavingRoom = null;
                            leavingRoom = Main.chooseRoom(leavingPerson);
                            leavingRoom.leave(leavingPerson, leavingRoom.getList());
                            break;
                        case 0:
                            break;
                        case 2:
                            for (Room x : listOfRooms) {
                                System.out.println(x.getRoomId() + ". Miejsce: " + x.getVolume() + " Czy wynajety: " + x.isInUse() + " Wynajety przez: " + x.getRenter() + "\n");
                            }
                            System.out.println("wybierz 0 aby wyjsc\nwybierz 1 aby sprawdzic pomieszczenie konkretnej osoby\nwybierz 2 aby wlozyc/wyjac przedmiot");
                            tmp = input.nextInt();
                            switch (tmp) {
                                case 0:
                                    break;
                                case 1:
                                    Person showWarehouseOfPerson = null;
                                    showWarehouseOfPerson = Main.choosePerson(listOfPersons);
                                    System.out.println(showWarehouseOfPerson.getRooms());
                                    break;
                                case 2:
                                    System.out.println("wybierz 0 aby wyjsc\nnacisnij 1 aby wlozyc przedmiot\nwybierz 2 aby wyjac przedmiot");
                                    int inputPutGet = input.nextInt();
                                    if (inputPutGet == 0) {
                                        break;
                                    }
                                    if (inputPutGet == 1) {
                                        Person p = null;
                                        p = Main.choosePerson(listOfPersons);
                                        Room inputPutItemToThisRoom = null;
                                        inputPutItemToThisRoom = Main.chooseRoom(p);

                                        Item item = null;
                                        item = Main.chooseitem(listOfItems);
                                        inputPutItemToThisRoom.insert(item);

                                    }
                                    if (inputPutGet == 2) {

                                        Person p = null;
                                        p = Main.choosePerson(listOfPersons);
                                        Room removeItemFromThisRoom = null;
                                        removeItemFromThisRoom = Main.chooseRoom(p);

                                        Item item = null;
                                        item = Main.chooseitem(removeItemFromThisRoom.getList());
                                        removeItemFromThisRoom.remove(item);
                                    }
                            }

                    }
                case 3:
                    try {
                        PrintToTxt.print(w1, listOfRooms);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Wybrales zla opcje!\nWybierz poprawna opcje");


            }

        }

    }

    public static Person choosePerson(List<Person> listOfPersons) {
        for (Person p : listOfPersons) {
            System.out.println(p.getPersonID() + ". " + p.getName() + " " + p.getSurname());
        }
        Person choosingPerson = null;
        System.out.println("Wybierz osobe: \n");
        Scanner input = new Scanner(System.in);
        int tmp = input.nextInt();
        for (Person p : listOfPersons) {
            if (p.getPersonID() == tmp) {
                choosingPerson = p;
            }
        }
        return choosingPerson;
    }


    public static Item chooseitem(List<Item> listOfItems) {
        Item item = null;
        listOfItems.forEach(i -> System.out.println(i.getItemID() + ". " + i.getName()));
        System.out.println("Wybierz przedmiot: \n");
        Scanner input = new Scanner(System.in);
        int tmp = input.nextInt();
        for (Item i : listOfItems) {
            if (i.getItemID() == tmp) {
                item = i;
            }
        }
        return item;
    }

    public static Room chooseRoom(List<Room> listOfRooms) {
        for (Room r : listOfRooms) {
            System.out.println(r.getRoomId() + ". Miejsce: " + r.getVolume() + " Czy wynajete: " + r.isInUse() + "\n");
        }
        Room choosingRoom = null;
        System.out.println("Wybierz pomieszczenie: \n");
        Scanner input = new Scanner(System.in);
        int tmp = input.nextInt();
        for (Room p : listOfRooms) {
            if (p.getRoomId() == tmp) {
                choosingRoom = p;
            }
        }
        return choosingRoom;
    }

    public static Room chooseRoom(Person person) {
        for (Room r : person.getRooms()) {
            System.out.println(r.getRoomId() + ". Miejsce: " + r.getVolume() + "\n");
        }
        Room choosingRoom = null;
        System.out.println("Wybierz pomieszczenie: \n");
        Scanner input = new Scanner(System.in);
        int tmp = input.nextInt();
        for (Room p : person.getRooms()) {
            if (p.getRoomId() == tmp) {
                choosingRoom = p;
            }
        }
        return choosingRoom;
    }
}
