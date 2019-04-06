package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new thread1());
        threads.add(new thread2());
        threads.add(new thread3());
        threads.add(new thread4());
        threads.add(new thread5());
    }

    public static class thread1 extends Thread {
        public void run(){
            while (true) {

            }
        }
    }

    public static  class thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class thread3 extends Thread {


        public void run(){
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class thread4 extends Thread implements Message {

        boolean on = false;

        @Override
        public void showWarning() {
            on = true;
        }

        @Override
        public void run() {
            while (!on) {

            }
        }
    }

    public static class thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String str = "";
        Integer num = 0;
        Integer sum = 0;

        public void run(){
            try {
                while (!(str = reader.readLine()).equals("N")) {
                    num = Integer.parseInt(str);
                    sum += num;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Сумма чисел = " + sum);
        }
    }




    public static void main(String[] args) {
        for (Thread x : threads) {
            x.start();
        }
    }
}