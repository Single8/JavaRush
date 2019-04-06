package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.regex.PatternSyntaxException;

/* 
Парсер реквестов
*/
//"http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo"
public class Solution {
    public static void main(String[] args) throws IOException {
        //HashMap<String,String> map = new HashMap<String,String>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String url = reader.readLine();
            String[] parts = url.split("\\?");
            String[] param = parts[1].split("&");
            for (String i : param) {
                if (i.contains("obj")) {
                    String[] ob = i.split("=");
                    list1.add(ob[0]);
                    list2.add(ob[1]);
                } else if (!i.contains("=")) {
                    list1.add(i);
                } else if (i.contains("=")) {
                    String[] nm = i.split("=");
                    list1.add(nm[0]);
                    //list2.add(nm[1]);
                }
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < list1.size(); i++) {
            if (i != list1.size()-1) System.out.print(list1.get(i) + " ");
            else System.out.print(list1.get(i));

        }

        System.out.println("");

        for (String y : list2) {
            //if (y.contains(".")) {
                try {
                    Solution.alert(Double.parseDouble(y));
                } catch (Exception e){
                    alert(y);
                }
            //} else alert(y);

        }
        
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
