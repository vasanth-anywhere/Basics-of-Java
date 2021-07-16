package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Kohli");
        linkedlist.add("Raina");
        linkedlist.add("Sachin");
        System.out.println(linkedlist);
        linkedlist.remove("Sachin");
        linkedlist.add("Hardik");
        linkedlist.add(0,"Dhoni");
        System.out.println(linkedlist);
    }
}
