interface Demo {
    void show();
}

class Test implements Demo {
    public void show() {
        System.out.println("Interface Method");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}