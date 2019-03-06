package com.donald;


import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("John");
        names.add("Mary");
        names.add("Jack");
        names.add("Mac");
        names.add("Sig");

        System.out.println(names.get(1) );

        names.remove(2);

        System.out.println(names.size());

        names.clear();

        System.out.println(names.size());






    }
}
