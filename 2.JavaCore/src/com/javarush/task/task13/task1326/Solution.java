package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(reader.readLine());
            while (fis.available() > 0)
            {
                int data = fis.read(); //читаем один int из потока для чтения
                arr.add(data); //записываем прочитанный int в другой поток.
            }

            for (Integer i: arr)
            {
                if (i % 2 == 0)
                {
                    arr1.add(i);
                }
            }


        } catch (Exception e) {

        }
    }
}
