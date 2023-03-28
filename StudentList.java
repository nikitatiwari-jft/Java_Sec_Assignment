package com.example.helloworld;
import java.util.ArrayList;
class Students {
    String name;
    int age;
    String course;

    Students(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Course is " + course);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Students) {
            Students other = (Students) obj;
            return name.equals(other.name) && age == (other.age) && course.equals(other.course);
        }
        return false;
    }
}
public class StudentList {
    public static void main(String[] args) {

        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("nikita", 20, "BAD"));
        list.add(new Students("neha", 22, "BA"));
        list.add(new Students("akash", 23, "BCA"));
        list.add(new Students("neha", 24, "MCA"));
        for (Students s : list) {
            s.display();
        }
        Students obj = new Students("neha", 24, "MCA");
        if (list.contains(obj)) {
            System.out.println("Found: " + obj.name+" "+ obj.age+ " "+obj.course);
        } else {
            System.out.println("Not found");
        }
    }
}
