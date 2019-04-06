package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream inStream = new FileInputStream(reader.readLine())) {

            reader.close();
        
        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            System.out.print((char)data);
        }
    } catch (FileNotFoundException e){
        System.out.println(e.getMessage());
    }
        //inStream.close();
        //reader.close();
    }
}