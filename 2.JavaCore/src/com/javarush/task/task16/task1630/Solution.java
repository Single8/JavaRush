package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {

    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String str = "";

        @Override
        public void setFileName(String fullFileName) {
            this.setName(fullFileName);
        }

        @Override
        public String getFileContent() {
            return this.str;
        }

        public void run(){
            BufferedReader reader1 = null;
            try {
                reader1 = new BufferedReader( new FileReader(Thread.currentThread().getName()));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String line = null;
            StringBuffer stringBuilder = new StringBuffer();
            String ls = " ";
            //System.getProperty("line.separator")
            try {
            while( ( line = reader1.readLine() ) != null ) {
                stringBuilder.append( line );
                stringBuilder.append( ls );
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            str = stringBuilder.toString();
        }
    }
}
