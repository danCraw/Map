package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Build {
    public static Object[] uniqueArrayList(ArrayList<String> arrayList) {
        Map<String, Integer> map = new HashMap<>();
        LinkedList linkedList;
        for (String string : arrayList) {
            if (map.keySet().contains(string)) {
                map.put(string, 1);
            } else {
                map.put(string, 1);
            }
        }
        String st = map.keySet().toString();
//        for (int string = 0; string < map.size(); string++) {
//            System.out.print(((LinkedList) map.keySet()).get(string));
////                linkedList.add(((LinkedList) map.keySet()).get(string));
//            }
        return map.keySet().toArray();
    }
}
