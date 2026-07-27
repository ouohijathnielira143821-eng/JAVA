interface A {
    void display();
}

interface B extends A {
    void show();
}

class Test implements B {
    public void display() {
        System.out.println("Display Method");
    }

    public void show() {
        System.out.println("Show Method");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
        t.show();
    }
}