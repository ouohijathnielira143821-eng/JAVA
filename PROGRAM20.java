// Overriding abstract methods: subclass MUST provide implementation
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method - no body, must be overridden
    abstract double calculateSalary();

    void showDetails() {
        System.out.println(name + "'s Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 75000.0;
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 60000.0;
    }
}

public class AbstractOverridingDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice");
        Employee e2 = new Developer("Bob");

        e1.showDetails();
        e2.showDetails();
    }
}