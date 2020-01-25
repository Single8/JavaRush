package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            
            String str = this.fileScanner.nextLine();
            String[] subStr;
            String delimeter = " ";
            subStr = str.split(delimeter);
            String stringDate = (subStr[3] + " " + subStr[4]+ " " + subStr[5]);
            Date date = new SimpleDateFormat("dd MM yyyy").parse(stringDate);
            return new Person(subStr[1], subStr[2], subStr[0], date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
