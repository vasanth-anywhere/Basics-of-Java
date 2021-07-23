package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(30, "Thirty");
        map.put(20, "Twenty");
        map.put(10, "Ten");
        System.out.println(map);
        System.out.println(map.lastEntry());
        System.out.println(map.firstEntry());
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(20));
        System.out.println(map.values());
    }
}
