package org.launchcode;

public abstract class BaseDisk {
    private String name;

    private double storageCapacity;

    private String discType;

    private int spinSpeed;

    //constructor
    public baseDisc(String name, Double storageCapacity, String discType, int spinSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
    }

    //getter
    public String getname() {
        return name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    //setter

    //custom methods
        public
}