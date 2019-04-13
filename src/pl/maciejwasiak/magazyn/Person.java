/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private int howManyRents;
    private String name, surname, address, dateOfBirth, pesel;
    private ZonedDateTime dateOfFirstRent;
    private List<Room> rooms;

    public Person(String name, String surname, String adress, String dateOfBirth, String pesel) {
        this.name = name;
        this.surname = surname;
        this.address = adress;
        this.dateOfBirth = dateOfBirth;
        this.howManyRents = 0;
        this.pesel = pesel;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getHowManyRents() {
        return howManyRents;
    }

    public void setHowManyRents(int howManyRents) {
        this.howManyRents = howManyRents;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public ZonedDateTime getDateOfFirstRent() throws NeverRentException {
        //This if checks if user have date of first rent of room and if not throws NeverRentException
        if (dateOfFirstRent != null) {
            return dateOfFirstRent;
        } else
            throw new NeverRentException("Uzytkownik nigy nie wypozyczyl pomieszenia!");
    }

    public void setDateOfFirstRent(ZonedDateTime dateOfFirstRent) {
        this.dateOfFirstRent = dateOfFirstRent;
    }

    public float[] freeVolumeInEachRoom() {
        float[] freeVolume = new float[rooms.size()];

        for (int i = 0; i < rooms.size(); i++) {
            freeVolume[i] = rooms.get(i).getFreeVolume();
        }

        return freeVolume;
    }

    @Override
    public String toString() {
        return "Osoba: \n" + " Imie: " + name + "\n Nazwisko: " + surname + "\n Adres: " + address + "\n Data urodzenia: " + dateOfBirth + "\n Pesel: " + pesel + "\n Data pierwszego wynajmu: " + dateOfFirstRent + "\n Ilosc wynajmow: " + howManyRents;

    }
}
