package pl.maciejwasiak.magazyn;

import java.time.ZonedDateTime;

public interface RentInterface {
    void rent(Person person, int howManyDays, ZonedDateTime dateOfRent);

    void leave();
}
