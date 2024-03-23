package org.example.poly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        Calculator c=new Calculator();
        c.add(1,2);
        c.add(1.0,2.0);
        c.add(1.0,2.0,3.0);

        List<Integer> list=getMyList();
        list.get(0);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.trimToSize();
    }

    private static LinkedList<Integer> getMyList() {

        LinkedList<Integer> arrayList=new LinkedList<>();
        arrayList.add(1);
        return arrayList;
    }
}
