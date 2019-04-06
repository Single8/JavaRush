package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n;
        while (true){
            n = reader.readLine();
                if (n != null) {
            
                Cat cat = CatFactory.getCatByKey(n);
                System.out.println (cat.toString());
            } else {
                return;
            }
        } 
        
        // do {
        //     n = reader.readLine();
        //     Cat cat = CatFactory.getCatByKey(n);
        //     System.out.println (cat.toString());
        // } while (n != null); 
        
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
