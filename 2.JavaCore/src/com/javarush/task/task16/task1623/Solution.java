package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;
//String.valueOf(createdThreadCount))
    public static void main(String[] args) {

            System.out.println(new GenerateThread());

    }

//    private static String toString(int createdThreadCount) {
//
//    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {

            super(String.valueOf(++createdThreadCount));
            //createdThreadCount++;
            start();
        }
            public void run() {
                if (createdThreadCount < count) {
                    System.out.println(new GenerateThread());
                }
            }


//        public GenerateThread(String name) {
//            super(name);
//            start();
//        }

        @Override
        public String toString() {
            return (getName() + " created");
        }
    }
}
