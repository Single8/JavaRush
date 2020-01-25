package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Byte> list1 = new ArrayList<>();
        ArrayList<Byte> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        reader.close();

        int i=0;

        BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(file1));
        while((i = fis1.read())!= -1){
            list1.add((byte) i);
        }
        //String data = fis1.r

        FileOutputStream fos = new FileOutputStream(file1);
        BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(file2));
        int x = 0;

        while((x = fis2.read())!= -1){
            list2.add((byte) x);
        }

        for (Byte r : list2) {
            fos.write(r);
        }

        for (Byte r : list1) {
            fos.write(r);
        }

        fos.close();
        fis1.close();
        fis2.close();


    }
}
