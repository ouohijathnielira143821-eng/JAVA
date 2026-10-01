interface A {
    void display();
}

interface B extends A {
    void show();
}

class Demo implements B {
    public void display() {
        System.out.println("Interface A");
    }

    public void show() {
        System.out.println("Interface B");
    }
}

class InterfaceExtend {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
        d.show();
    }
}