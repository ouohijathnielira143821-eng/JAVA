class SimpleException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues...");
    }
}