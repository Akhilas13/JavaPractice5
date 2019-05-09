//program to update specific array element by given element and empty the ​ array list​ .
package com.stackroute.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateSpecificArrayElement {
    public static void main(String[] args) {
        //arraylist of fruits
        ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        UpdateSpecificArrayElement u = new UpdateSpecificArrayElement();
        u.fruits(fruitsList);
    }

    private void fruits(ArrayList<String> fruitsList) {
        System.out.println("input:" + fruitsList);
        //update specific array element with given element
        fruitsList.set(0, "kiwi");
        fruitsList.set(2, "Mango");
        //arraylist after updation
        System.out.println("output:" + fruitsList);
        fruitsList.clear();//arraylist after removing all elements
        System.out.println(fruitsList);
    }


}
