class ExceptionChaining {
    public static void main(String[] args) {
        try {
            NumberFormatException e =
                new NumberFormatException("Invalid number");

            e.initCause(new ArithmeticException("Original cause"));

            throw e;
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: " + e);
            System.out.println("Cause: " + e.getCause());
        }
    }
}