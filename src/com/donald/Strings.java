package com.donald;

public class Strings {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped upon a very lazy dog";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        String s = sentence.toLowerCase();
        System.out.println(s);
        System.out.println(sentence.replace("lazy", "hardworking"));
        System.out.println(sentence.length());

    }
}