package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = set.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + set);
        System.out.println("Reverse order: " + reverseNs);

        NavigableSet<Integer> threeOrMore = set.tailSet(3, true);
        System.out.println("3 or  more:  " + threeOrMore);

        System.out.println("lower(3): " + set.lower(3));
        System.out.println("higher(3): " + set.higher(3));

        System.out.println("floor(3): " + set.floor(3));
        System.out.println("ceiling(3): " + set.ceiling(3));

        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("Navigable Set:  " + set);

        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("Navigable Set:  " + set);

        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("Navigable Set:  " + set);

        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("Navigable Set:  " + set);

        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("Navigable Set:  " + set);

        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());

    }
}
