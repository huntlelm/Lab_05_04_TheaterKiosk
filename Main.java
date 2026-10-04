import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables and scanner
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        // Ask user for their age
        System.out.print("Enter your age: ");
        age = in.nextInt();
        in.nextLine();

        // Display wristband message only if 21 or older
        if (age >= 21) {
            System.out.println("You get a wrist band.");
        }
        // If not 21 or order, does nothing

    }
}