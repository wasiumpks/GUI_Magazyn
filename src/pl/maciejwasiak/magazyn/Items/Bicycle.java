package pl.maciejwasiak.magazyn.Items;

public class Bicycle extends Item {
    private int howManyGears, howManyShockAbsorbers;
    private String brakesType;
    private boolean isSuspended;

    public Bicycle(int howManyGears, String brakesType, int volumeOfItem, boolean isFoldable) {
        this.howManyGears = howManyGears;
        this.brakesType = brakesType;
        this.isSuspended = false;
        this.volumeOfItem = volumeOfItem;
        this.isFoldable = isFoldable;

    }

    public Bicycle(int howManyGears, String brakesType, int howManyShockAbsorbers, int volumeOfItem, boolean isFoldable) {
        this.howManyGears = howManyGears;
        this.brakesType = brakesType;
        this.isSuspended = true;
        this.volumeOfItem = volumeOfItem;
        this.howManyShockAbsorbers = howManyShockAbsorbers;
        this.isFoldable = isFoldable;

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


