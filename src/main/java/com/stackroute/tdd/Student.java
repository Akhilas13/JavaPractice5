// Student class that represents the following information of a student: id, name, and age
// all the member variables should be private .
// a. Implement `getter and setter` .
// b. Create a `StudentSorter` class that implements `Comparator interface` .
// c. Write a class `Maintest` create Student class object(minimum 5)
// d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having
// same age, sort based on their name.
// f. For students having same name and age, sort them acco

package com.stackroute.tdd;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Student {
    private String name;
    private int age;
    private String id;

    // Constructor

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    // Getter

    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


//comparisons

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        //if ages are equal sort  with names
        if (a.getAge() == b.getAge()) {
            //if names are equal sort with id's
            if (a.getName().equals(b.getName()))
                return a.getId().compareTo(b.getId());
                //if names are not equal sort with names
            else
                return a.getName().compareTo(b.getName());
            //if ages are not equal sort with ages
        } else {
            return b.getAge() - a.getAge();
        }
    }
}


class Maintest {
    public static void main(String[] args) {


        // creating 5 objects of Student class
        Student student1 = new Student("Akhila", 23, "1");
        Student student2 = new Student("sherin", 24, "2");
        Student student3 = new Student("lasima", 22, "3");
        Student student4 = new Student("sheby", 22, "4");
        Student student5 = new Student("shona", 23, "5");


        //creating arraylist
        ArrayList<Student> details = new ArrayList<Student>();

        //adding Student class object
        details.add(student1);
        details.add(student2);
        details.add(student3);
        details.add(student4);
        details.add(student5);


        //Getting Iterator
        Iterator iterator = details.iterator();

        //traversing elements of ArrayList object
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getId());
        }

        //sorting
        Collections.sort(details, new StudentSorter());
        System.out.println(details);


        // after sorting iterate using for loop

        System.out.println(("\n\nThe sorted list is : \n"));
        for (int i = 0; i < details.size(); ++i) {

            PrintStream variable1 = System.out;
            String variable2 = details.get(i).getId();
            variable1.println(variable2 + " " + details.get(i).getName() + " " + details.get(i).getAge());
        }
    }
}









