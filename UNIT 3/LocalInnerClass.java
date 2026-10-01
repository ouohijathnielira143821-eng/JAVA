class Outer {
    void display() {
        class Inner {
            void show() {
                System.out.println("This is a local inner class.");
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}