import java.util.Scanner;

class RuntimeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int a = sc.nextInt();

        System.out.print("Enter float: ");
        float b = sc.nextFloat();

        System.out.print("Enter double: ");
        double c = sc.nextDouble();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.println("\nEntered Values");
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + ch);
        System.out.println("String: " + str);
    }
}