/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

public class Person {

    private String name, surname, address, dateOfBirth, dateOfFirstRent;

    public Person(String name, String surname, String adress, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.address = adress;
        this.dateOfBirth = dateOfBirth;
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

    public String getDateOfFirstRent() throws NeverRentException {
        //This if checks if user have date of first rent of room and if not throws NeverRentException
        if (dateOfFirstRent != null && !dateOfFirstRent.isEmpty()) {
            return dateOfFirstRent;
        } else
            throw new NeverRentException("Uzytkownik nigy nie wypozyczyl pomieszenia!");
    }

    public void setDateOfFirstRent(String dateOfFirstRent) {
        this.dateOfFirstRent = dateOfFirstRent;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfFirstRent='" + dateOfFirstRent + '\'' +
                '}';
    }
}
