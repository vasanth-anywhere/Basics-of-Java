package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> workList = new ArrayList<>(30);
        for(int i=1;i<25;i++) {
            workList.add(i);
        }
        for(int i=0;i<workList.size();i++) {
            if(workList.get(i) % 5 == 0) workList.remove(workList.get(i));
        }
        System.out.println(workList);
    }
}
