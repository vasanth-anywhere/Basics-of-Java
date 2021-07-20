package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] arr1 = {22,33,43,21,87,45};
        Integer[] arr2 = {22,33,56,67,78,90};

        Set<Integer> set1 = new HashSet(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet(Arrays.asList(arr2));

        //Union
        Set unionData = new HashSet(set1);
        unionData.addAll(set2);
        System.out.println("Union Data :"+unionData);

        //Intersection
        Set interactData = new HashSet(set1);
        interactData.retainAll(set2);
        System.out.println("Intersected Data :"+interactData);

        //Difference
        Set diffData = new HashSet(set1);
        diffData.removeAll(set2);
        System.out.println("Difference Data :"+diffData);

    }
}
