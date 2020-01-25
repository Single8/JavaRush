package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(filename);
        ArrayList<Integer> list = new ArrayList<>();
        //HashMap<Integer, Integer> map = new HashMap<>();

        while (fis.available() > 0) {
            int data = fis.read();
            list.add(data);
        }

        Collections.sort(list);

        for (int i=0; i < list.size(); i++){
            if (i == 0) {
                System.out.print(list.get(i) + " ");
            } else if (list.get(i) != list.get(i-1)) {
                System.out.print(list.get(i) + " ");
            } else {
                continue;
            }
        }

        fis.close();
    }
}
