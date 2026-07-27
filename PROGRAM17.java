// Interface: pure abstraction, all methods are implicitly public abstract
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key/button.");
    }

    public void stop() {
        System.out.println("Car stops with brakes.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}