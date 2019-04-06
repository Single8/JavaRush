package com.javarush.task.task17.task1712;

public class Table {
    private static byte tableNumber;        //!!!похоже косяк!!!
    private byte number = ++tableNumber;        //!!!похоже косяк!!!

    public Order getOrder () {
        return new Order(number);
    }
}
