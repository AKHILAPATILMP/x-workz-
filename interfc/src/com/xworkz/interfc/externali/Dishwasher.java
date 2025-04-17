package com.xworkz.interfc.externali;

public interface Dishwasher {
    void washDishes();
    void rinseDishes();
    void dryDishes();
    default void dish(){
        System.out.println("dish");
    }
}
