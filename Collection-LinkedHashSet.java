package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> workSet = new LinkedHashSet<String>();
        String[] arr = {"hello","hi","greetings"};
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        list.add("namaste");
        System.out.println(list);
        workSet.addAll(list);
        workSet.add("hello");
        workSet.add("hi");
        System.out.println(workSet);
        System.out.println(workSet.contains("hi"));
        System.out.println(workSet.hashCode());
    }
}
