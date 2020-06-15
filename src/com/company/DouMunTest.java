package com.company;

import java.util.ArrayList;
import java.util.List;

public class DouMunTest {
    public static void main(String[] args) {
        ArrayList<Integer> srcList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            srcList.add(i);

        }
        List<Integer> list = getEvenNum(srcList);
        System.out.println(list);
    }

    public static List<Integer> getEvenNum(List<Integer> list) {
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i <list.size(); i++) {
            if (i % 2 == 0)
                arrayList.add(i);
        }

        return arrayList;
    }
}