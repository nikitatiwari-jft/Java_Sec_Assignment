package com.example.helloworld;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("pear");

        System.out.println("HashSet elements: " + hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet elements: " + treeSet);


    }
}
