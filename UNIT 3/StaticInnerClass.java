class Outer {
    static int x = 20;

    static class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}