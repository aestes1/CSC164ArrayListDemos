//Array lists will only work with objects (strings)
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Declaring ArrayList
        //Language level file > project structure > Project > Project language level = 8
        ArrayList<String> list = new ArrayList<>();

        //Creating a new list
        list.add("Delaware");
        list.add("Alaska");
        list.add("New York");

        //removing a list
        list.remove("Alaska");

        //"list.contains" is a boolean
        System.out.println("Alaska on the list? " + list.contains("Alaska"));

        //Find the lowest value
        System.out.println("Least Value = " + Collections.min(list));

        //Find the largest value
        System.out.println("Largest Value = " + Collections.max(list));

        //shuffles the list
        Collections.shuffle(list);

        //Sorts the list
        Collections.sort(list);

        System.out.println(list);
        //finds and prints array size
        System.out.println("Number of elements in this list = " + list.size());
    }
}
