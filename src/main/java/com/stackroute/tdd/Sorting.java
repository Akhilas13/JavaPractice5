//a program to implement set interface which sorts the given randomly ordered names in ascending order
// Convert the sorted set in to an ​ array list

package com.stackroute.tdd;


import java.util.Set;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {
        Set setA = new TreeSet();
        String element1 = "Harry";
        setA.add(element1);
        String element2="Olive";
        setA.add(element2);
        String element3="Bluto";
        setA.add(element3);
        String element4="Hulk";
        setA.add(element4);
        System.out.println(setA);


    }

}
