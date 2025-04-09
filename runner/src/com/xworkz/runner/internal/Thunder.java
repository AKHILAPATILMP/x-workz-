package com.xworkz.runner.internal;

public class Thunder {
    private String meaning;
    private String symbolism;
    private double intensity;

    public Thunder(String meaning, String symbolism, double intensity) {
        this.meaning = meaning;
        this.symbolism = symbolism;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "[meaning=" + meaning + ", symbolism=" + symbolism + ", intensity=" + intensity + "]";
    }
}
