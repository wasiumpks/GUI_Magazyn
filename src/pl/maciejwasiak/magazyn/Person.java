/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

import java.time.ZonedDateTime;

public class Person {

    private int howManyRents;
    private String name, surname, address, dateOfBirth, pesel;
    private ZonedDateTime dateOfFirstRent;

    public Person(String name, String surname, String adress, String dateOfBirth, String pesel) {
        this.name = name;
        this.surname = surname;
        this.address = adress;
        this.dateOfBirth = dateOfBirth;
        this.howManyRents = 0;
        this.pesel = pesel;
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

    @Override
    public String toString() {
        return "Person{" +
                "howManyRents=" + howManyRents +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dateOfFirstRent=" + dateOfFirstRent +
                '}';
    }
}
