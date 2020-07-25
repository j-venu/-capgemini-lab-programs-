package com.capg.ui;

import java.util.ArrayList;
import java.util.Collections;

import com.capg.sorting.SortByAge;
import com.capg.sorting.SortByName;
import com.capg.sorting.Student;

public class Presentation {

public static void main(String[] args) {
// TODO Auto-generated method stub

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student("venu", 23, 5.5));
        ar.add(new Student("shashi", 22, 5.6));
        ar.add(new Student("ramesh", 25, 5.8));
 
 
        Collections.sort(ar, new SortByAge());
 
       System.out.println("Sorted by age");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new SortByName());
 
        System.out.println("Sorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
}

}
//uipackage





