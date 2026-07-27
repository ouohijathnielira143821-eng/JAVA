// Hierarchical Inheritance: One base class, multiple derived classes
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("The cow moos.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        Cow cw = new Cow();
        cw.eat();
        cw.moo();
    }
}
