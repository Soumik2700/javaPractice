package oopsProgramming;

import java.util.*;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    String roll;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
    }

    Student(Student student2) {
        this.name = student2.name;
        this.age = student2.age;
        this.roll = student2.roll;
    }

    Student() {
        // this.name = name;
        // this.age = age;
        // this.roll = roll;
    }
}

public class OOPS {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Soumik";
        student1.age = 24;
        student1.roll = "24000122054";

        Student student2 = new Student(student1);
        student2.printInfo();
    }
}
