import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int i = 0;
        String userinput2 = "yes";
        do {
            System.out.println("Enter an integer: ");
            int userInput = scan1.nextInt();

            System.out.printf("%-15s %-15s %-15s %n","Number", "Squared", "Cubed");
            System.out.printf("%-15s %-15s %-15s %n","=======", "=======", "=======");

            for (i = 1; i <= userInput; i++) {
                System.out.printf("%-15d %-15d %-15d %n", i, i * i, i*i*i);

            }
            System.out.println("Continue?  Enter yes or no:");
            scan1.nextLine();
            userinput2 = scan1.nextLine();
        }

        while (userinput2.equalsIgnoreCase("yes"));

    }
}
