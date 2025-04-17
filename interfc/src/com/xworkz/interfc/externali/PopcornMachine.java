package com.xworkz.interfc.externali;

public interface PopcornMachine {
    void makePopcorn();

    void servePopcorn();

    void cleanMachine();

    default void corn() {
        System.out.println("corn");
    }
}