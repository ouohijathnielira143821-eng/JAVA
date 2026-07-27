// Multilevel Inheritance: A -> B -> C (chain of inheritance)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal (grandparent)
        d.walk();  // from Mammal (parent)
        d.bark();  // own method
    }
}