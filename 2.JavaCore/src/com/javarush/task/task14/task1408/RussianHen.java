package com.javarush.task.task14.task1408;

/**
 * Created by om on 24.01.2019.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth(){
        return 30;
    }

    @Override
    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
    }

}
