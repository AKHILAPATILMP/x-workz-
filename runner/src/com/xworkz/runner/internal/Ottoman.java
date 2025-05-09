package com.xworkz.runner.internal;

public class Ottoman {
    private String material;
    private String color;
    private double height;

    public Ottoman(String material, String color, double height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", height=" + height + " cm]";
    }

    @Override
    public int hashCode() {
        System.out.println("value: " + super.hashCode());
        return 707;
    }
}
