package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSet {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("India", "New Delhi");
        hashMap.put("USA", "Washington D.C.");
        hashMap.put("Japan", "Tokyo");
        System.out.println(hashMap);
        Map<String, String> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        for(String value: hashMap.values())
        {
            System.out.println(value);
        }
    }
}