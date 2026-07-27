class Parent {
    void display() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child Class");
    }
}

public class Q13 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
    }
}