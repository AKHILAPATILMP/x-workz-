package com.xworkz.interfc.externali;

public interface SmartDoor {
    void lock();
    void unlock();
    void monitorEntry();
    default void door() {
        System.out.println("door");
    }

    void thermo();
}
