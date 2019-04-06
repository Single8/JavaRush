package com.javarush.task.task14.task1408;

/**
 * Created by om on 24.01.2019.
 */
public abstract class Hen implements Country {
    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я - курица.";
    }
}
