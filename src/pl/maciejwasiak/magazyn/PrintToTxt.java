/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintToTxt {
    static FileWriter fw;

    public static void print(Warehouse w, List<Room> listOfRooms) throws IOException {

        fw = new FileWriter("stanMagazynu.txt");

        fw.write(w.toString() + "\n");
        for (Room r : listOfRooms) {
            fw.write(r.toString() + "\n\n");
        }
        fw.flush();
        System.out.println((char) 27 + "[33mZAPISANO DO PLIKU!" + (char) 27 + "[0m");

    }
}
