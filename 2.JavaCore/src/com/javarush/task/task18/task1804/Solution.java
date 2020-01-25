package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(filename);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        while (fis.available() > 0) {
            int data = fis.read();
            list.add(data);
        }

        for (int i = 0; i < list.size(); i++){
            Integer frequency = map.get(list.get(i));
            map.put(list.get(i), frequency == null ? 1 : frequency + 1);
        }
        Integer z = 265;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (pair.getValue() < z){
                z = pair.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (pair.getValue().equals(z)){
                System.out.print(pair.getKey() + " ");
            }
        }


//        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
//
//                System.out.print(pair.getKey() + " " + pair.getValue());
//
//        }
        System.out.close();
        fis.close();
    }
}
