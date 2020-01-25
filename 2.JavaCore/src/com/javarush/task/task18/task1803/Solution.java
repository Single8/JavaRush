package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int min = 256;
        while (inputStream.available() > 0) {

            int data = inputStream.read();
            if (data < min) min = data;
            //добавить его к общей сумме
        }
        System.out.println(min);
        inputStream.close();
    }
}