class ThrowsDemo {
    static void check() throws InterruptedException {
        System.out.println("Method is running...");
        Thread.sleep(1000);
        System.out.println("Method completed.");
    }

    public static void main(String[] args) {
        try {
            check();
        }
        catch (InterruptedException e) {
            System.out.println("Exception handled.");
        }
    }
}