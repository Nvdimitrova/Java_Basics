package Practice_05;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter age");
        double age = Double.parseDouble(scanner.nextLine());
        System.out.println("Please, enter gender");
        String gender = scanner.nextLine();

        if ("m".equals(gender)) {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else if ("f".equals(gender)) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        }
        scanner.close();
    }
}
