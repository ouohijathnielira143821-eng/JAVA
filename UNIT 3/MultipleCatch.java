class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[10] = 50;

            int b = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred.");
        }
        catch (Exception e) {
            System.out.println("General exception occurred.");
        }
    }
}