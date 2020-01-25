package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list1 = new ArrayList<>();
        //ArrayList<Byte> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        String i;
        BufferedReader fis1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedWriter fos = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
        while((i = fis1.readLine())!= null){
            String [] string = i.split(" ");
            for (String z : string) {
                list1.add(Math.round(Float.parseFloat(z)));
                //fos.write((int) (Math.round (Double.parseDouble(i))));
                //(Math.round((int)i));
            }
        }

        for (int x = 0; x < list1.size(); x++) {
            if (x != list1.size()-1) fos.write(list1.get(x) + " ");
            else fos.write(list1.get(x).toString());

//          System.out.print(x);
//          System.out.print(" ");
        }

        fis1.close();
        fos.close();
    }
}
