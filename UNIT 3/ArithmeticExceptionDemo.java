class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;
            int c = a / b;

            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        }
    }
}