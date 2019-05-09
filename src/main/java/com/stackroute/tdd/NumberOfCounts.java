//a program to find the number of counts in the following ​ String​ .
// Store the output in Map<​ String​ ,Integer> as key value pair.
package com.stackroute.tdd;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCounts {
    public static void main(String[] args) {
        String sentence1 = "one one -one___two,,three,one @three*one?two";
        String sentence2 = sentence1.replace(",", " ").replace("-", " ").replace("_", " ").replace("@", " ").replace("*", " ").replace("?", " ");
        System.out.println(sentence2);
        NumberOfCounts numberOfCounts = new NumberOfCounts();
        numberOfCounts.stringIntegerPair(sentence2);

    }

    public void stringIntegerPair(String sentence2) {

        // Creating a HashMap containing word
        // as a  key and occurrences as  a value
        Map<String, Integer> mymap = new HashMap<String, Integer>();


        //converting given string to string array
        String[] array = new String[10];
        array = sentence2.split(" ");


        // If char is present in mymap,
        // incrementing it's count by 1
        for (String s : array) {
            if (mymap.containsKey(s)) {
                mymap.put(s, mymap.get(s) + 1);
            }


            // If string is not present in mymap,
            // putting this char to mymap with 1 as it's value
            else {
                mymap.put(s, 1);
            }

        }
        //removing count of space
        mymap.remove("");


        // Printing the mymap
        System.out.println(mymap);


    }

}
