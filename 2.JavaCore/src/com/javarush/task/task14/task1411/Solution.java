package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* 
User, Loser, Coder and Proger
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> hashMap = new HashMap<String, Person>();
        hashMap.put("user", null);
        hashMap.put("loser", null);
        hashMap.put("coder", null);
        hashMap.put("proger", null);
        
        //String arr[] = {"user", "loser", "coder", "proger", "person"};
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        do {
            key = reader.readLine();
                if (!key.equals("")) {
                    if (hashMap.containsKey(key)) {


                        if (key.equals("user")) hashMap.put(key, person = new Person.User());
                        else if (key.equals("loser")) hashMap.put(key, person = new Person.Loser());
                        else if (key.equals("coder")) hashMap.put(key, person = new Person.Coder());
                        else if (key.equals("proger")) hashMap.put(key, person = new Person.Proger());
                        
                        doWork(person);
                    }
                }
            
        } while (!key.equals(""));
        
    }

    public static void doWork(Person person) {

            if (person instanceof Person.User) ((Person.User)person).live();
            else if (person instanceof Person.Loser) ((Person.Loser)person).doNothing();
            else if (person instanceof Person.Coder) ((Person.Coder)person).writeCode();
            else if (person instanceof Person.Proger) ((Person.Proger)person).enjoy();

    }
}
