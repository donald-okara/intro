package com.donald;

public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {45, 79, 87, 98, 87, 98, 46, 46, 88};
        String names[] = {"Jonah", "Bishop", "Steve", "Rodgers", "Bart", "Sympson"};
        System.out.println(marks[0]);
        try {
            System.out.println(names[10]);

        } catch (Exception e)
        {
            System.out.println("Error when fetching the name");



        }
        Functions.areaCircle(21);
    }
}
