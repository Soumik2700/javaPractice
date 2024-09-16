package oopsProgramming;

class Shape {
    public void printArea() {
        System.out.println("Display area: ");
    }
}

class Triangle {
    public void printArea(int l, int h) {
        double area = 0.5 * h * l;
        System.out.println(area);
    }
}

class Circle {
    public void printArea(int r) {
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}

public class Inheritance {
    public static void main(String[] args) {
    }
}
