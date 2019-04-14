/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

public class Bicycle extends Item {
    private int howManyGears, howManyShockAbsorbers;
    private String brakesType;
    private boolean isSuspended;

    /*

        public Rower(String nazwa, float powierzchnia, int liczbaPrzerzutek, HamulceTyp typ, int liczbaAmortyzatorów, boolean czySkladany) {
        super(nazwa, powierzchnia);
        this.liczbaPrzerzutek = liczbaPrzerzutek;
        this.typ = typ;
        this.liczbaAmortyzatorów = liczbaAmortyzatorów;
        if(liczbaAmortyzatorów == 0){
            this.czyAmortyzowany = false;
        }else{
            this.czyAmortyzowany = true;
        }
        this.czySkladany = czySkladany;
        this.czyZlozony = false;
    }
    public Rower(String nazwa, float dlugosc, float szerokosc, float wysokosc, int liczbaPrzerzutek, HamulceTyp typ, int liczbaAmortyzatorów, boolean czySkladany){
        this(nazwa,(dlugosc*szerokosc*wysokosc), liczbaPrzerzutek, typ, liczbaAmortyzatorów, czySkladany);
    }
     */


    public Bicycle(String name, int howManyGears, String brakesType, int howManyShockAbsorbers, boolean isFoldable, int volumeOfItem) {
        this.howManyGears = howManyGears;
        this.brakesType = brakesType;
        this.volumeOfItem = volumeOfItem;
        this.howManyShockAbsorbers = howManyShockAbsorbers;
        this.isFoldable = isFoldable;
        this.name = name;
        this.isSuspended = howManyShockAbsorbers != 0;

    }

    public Bicycle(String name, int howManyGears, String brakesType, int howManyShockAbsorbers, boolean isFoldable, float xDimension, float yDimension, float zDimension) {
        this.howManyGears = howManyGears;
        this.brakesType = brakesType;
        this.volumeOfItem = (xDimension * yDimension * zDimension);
        this.howManyShockAbsorbers = howManyShockAbsorbers;
        this.isFoldable = isFoldable;
        this.xDimension = xDimension;
        this.zDimension = zDimension;
        this.yDimension = yDimension;
        this.name = name;
        this.isSuspended = howManyShockAbsorbers != 0;

    }

    public int getHowManyGears() {
        return howManyGears;
    }

    public void setHowManyGears(int howManyGears) {
        this.howManyGears = howManyGears;
    }

    public String getBrakesType() {
        return brakesType;
    }

    public void setBrakesType(String brakesType) {
        this.brakesType = brakesType;
    }

    public int getHowManyShockAbsorbers() {
        return howManyShockAbsorbers;
    }

    public void setHowManyShockAbsorbers(int howManyShockAbsorbers) {
        this.howManyShockAbsorbers = howManyShockAbsorbers;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }
}
