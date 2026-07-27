import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}