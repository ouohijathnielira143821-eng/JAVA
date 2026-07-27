// Method Overriding: subclass provides a specific implementation
// of a method already defined in its parent class (runtime polymorphism)
class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();  // calls Dog's version

        a = new Cat();
        a.sound();  // calls Cat's version
    }
}