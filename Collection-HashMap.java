package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        System.out.println(map);
        map.put(1,"Ameer");
        map.put(2,"Josh");
        map.put(3,"Vetri");
        System.out.println(map.get(3));
        System.out.println(map);
        map.replace(2,map.get(2),"Mohan");
        System.out.println(map);
        map.remove(2);
    }
}
