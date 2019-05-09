// program where an array of strings is input and output is a Map<​ String​ ,boolean> where
//each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
package com.stackroute.tdd;

import java.util.HashMap;
import java.util.Map;

public class StringAppearsMoreThanTwo {
    public static void main(String[] args) {
        String[] sentence = new String[]{"a", "b", "c", "d", "a", "c", "c"};
        StringAppearsMoreThanTwo stringAppearsMoreThanTwo = new StringAppearsMoreThanTwo();
        stringAppearsMoreThanTwo.checkForOccurence(sentence);
    }

    public void checkForOccurence(String[] sentence) {
        //creating a hashmap containing word
        Map<String, Boolean> mymap = new HashMap<String, Boolean>();
        for (String word : sentence) {
            //if word is present in mymap set its value as true
            if (mymap.containsKey(word)) {
                mymap.put(word, true);
            }
            //if not set value as false
            else {
                mymap.put(word, false);
            }


        }
        //print mymap
        System.out.println(mymap);
    }
}
