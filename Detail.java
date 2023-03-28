package com.example.helloworld;
class Student {
    String name;
    int age;
    String course;
    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }
    void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Course is " + course);
    }
}
    public class Detail {
    public static void main(String args[]){
        Student s = new Student("Akash", 21, "Computer Science");
        s.display();
    }
}