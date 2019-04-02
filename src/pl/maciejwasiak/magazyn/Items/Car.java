/*
 * Copyright (c) 2019.
 * Created by Maciej Wasiak
 * s18952@pjwstk.edu.pl
 */
package pl.maciejwasiak.magazyn.Items;

public class Car extends Item {
    private int engineCapacity;
    private String fuelType;
    private boolean approval;

    public Car(String name, int engineCapacity, String fuelType, int volumeOfItem, boolean approval, boolean isFoldable) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.approval = approval;
        this.volumeOfItem = volumeOfItem;
        this.isFoldable = isFoldable;
        this.name = name;
    }

    public Car(String name, int engineCapacity, String fuelType, boolean approval, boolean isFoldable, float xDimension, float yDimension, float zDimension) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.approval = approval;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", approval=" + approval +
                ", volumeOfItem=" + volumeOfItem +
                ", xDimension=" + xDimension +
                ", yDimension=" + yDimension +
                ", zDimension=" + zDimension +
                ", isFoldable=" + isFoldable +
                ", name='" + name + '\'' +
                '}';
    }
}
