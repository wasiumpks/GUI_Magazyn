/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */

package pl.maciejwasiak.magazyn.Items;

public class LawnMower extends Item {
    private int engineCapacity;
    private FuelType fuelType;

    public LawnMower(String name, int engineCapacity, FuelType fuelType, int volumeOfItem, boolean isFoldable) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.name = name;
        this.volumeOfItem = volumeOfItem;
        this.isFoldable = isFoldable;

    }

    public LawnMower(String name, int engineCapacity, FuelType fuelType, boolean isFoldable, float xDimension, float yDimension, float zDimension) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.volumeOfItem = (xDimension * yDimension * zDimension);
        this.isFoldable = isFoldable;
        this.name = name;
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.zDimension = zDimension;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "LawnMower{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType=" + fuelType +
                ", volumeOfItem=" + volumeOfItem +
                ", xDimension=" + xDimension +
                ", yDimension=" + yDimension +
                ", zDimension=" + zDimension +
                ", isFoldable=" + isFoldable +
                ", name='" + name + '\'' +
                '}';
    }
}
