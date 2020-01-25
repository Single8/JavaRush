package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        //FileInputStream fis = new FileInputStream(args[0]);

        FileInputStream fis = new FileInputStream("d:/1/1.txt");
        ArrayList<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new TreeMap<>();

        while (fis.available() > 0) {
            int data = fis.read();
            list.add((char)data);
        }

        for (int i = 0; i < list.size(); i++){
            Integer frequency = map.get(list.get(i));
            map.put(list.get(i), frequency == null ? 1 : frequency + 1);
        }

        //map.s

//        for (Integer po : list) {
//            System.out.println(po);
//        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()){
            System.out.println( pair.getKey()  + " " + pair.getValue());
            }

//        int z = 0;
//
//        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
//            if (pair.getValue() > z){
//                z = pair.getValue();
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
//            if (pair.getValue().equals(z)){
//                System.out.print(pair.getKey() + " ");
//            }
//        }

        fis.close();
    }
}
