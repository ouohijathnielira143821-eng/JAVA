class Outer {
    interface Inner {
        void display();
    }
}

class NestedInterface implements Outer.Inner {
    public void display() {
        System.out.println("This is a nested interface.");
    }

    public static void main(String[] args) {
        NestedInterface obj = new NestedInterface();
        obj.display();
    }
}