package com.stackroute.tdd;

import java.util.HashMap;
import java.util.TreeMap;

public class Value {
    public static void main(String[] args) {

        //   Creation of HashMap
        HashMap<String, String> myMap = new HashMap<String, String>();

        //    Adding values to HashMap as ("keys", "values")
        myMap.put("Language", "Java");
        myMap.put("Code", "HashMap");
        System.out.println(myMap);
        myMap.put("Code",myMap.get("Language"));
        myMap.put("Language","null");
        System.out.println(myMap);


    }
}
