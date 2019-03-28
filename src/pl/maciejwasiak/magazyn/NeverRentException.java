/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn;

public class NeverRentException extends Exception {
    public NeverRentException(String message) {
        super(message);
    }
}
