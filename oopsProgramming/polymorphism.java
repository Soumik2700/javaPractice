package oopsProgramming;

class Students {
    String name;
    int age;

    // Method overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Students std1 = new Students();
        std1.name = "Soumik";
        std1.age = 24;

        // Calling the correct method
        std1.printInfo(std1.age); // This calls printInfo(int age)
    }
}
