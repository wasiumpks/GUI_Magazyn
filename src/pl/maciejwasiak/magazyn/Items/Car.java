package pl.maciejwasiak.magazyn.Items;

public class Car extends Item {
    private int engineCapacity;
    private String fuelType;
    private boolean approval;


    public Car(int engineCapacity, String fuelType, int volumeOfItem, boolean approval, boolean isFoldable) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.approval = approval;
        this.volumeOfItem = volumeOfItem;
        this.isFoldable = isFoldable;
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
}
