package com.example.helloworld;
import java.util.ArrayList;
public class ListTest {
    public static void main(String args[]){
        ArrayList<String> abc=new ArrayList<>();
        abc.add("apple");
        abc.add("mango");
        abc.add("banana");
        abc.add("dates");
        abc.add("cherry");
        System.out.println(abc);
        abc.add(2,"onion");
        System.out.println(abc);
        if(abc.contains("banana")){
            System.out.println("Element is found");
        }
        else
        {
            System.out.println("element not found");
        }
        System.out.println(abc.indexOf("banana"));
        abc.remove("banana");
        System.out.println(abc);

    }
}
