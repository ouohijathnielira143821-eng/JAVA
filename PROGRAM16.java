// Abstract class: cannot be instantiated, can have abstract and concrete methods
abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    // Abstract method - must be implemented by subclasses
    abstract double area();

    // Concrete method - shared by all subclasses
    void display() {
        System.out.println(name + " area: " + area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.display();
        s2.display();
    }
}