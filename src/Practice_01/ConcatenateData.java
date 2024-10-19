package Practice_01;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your first name");
        String fistName = scanner.nextLine();
        System.out.println("Please, enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please, enter your age");
        int ages = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter your town");
        String town = scanner.nextLine();

        System.out.println("You are " + fistName + " "
                + lastName + "," + " " + "a " + ages
                + "-years old person from" + " "
                + town + ".");
        scanner.close();
    }
}
