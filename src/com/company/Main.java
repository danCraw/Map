package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("aa");
        arrayList.add("aaa");
        arrayList.add("aa");
        arrayList.add("aa");
        System.out.print(Arrays.toString(Build.uniqueArrayList(arrayList)));
    }
}
