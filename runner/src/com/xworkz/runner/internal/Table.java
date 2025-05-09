package com.xworkz.runner.internal;

public class Table {
    private String material;
    private String shape;
    private int legs;

    public Table(String material, String shape, int legs) {
        this.material = material;
        this.shape = shape;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shape=" + shape + ", legs=" + legs + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 912;
    }
}
