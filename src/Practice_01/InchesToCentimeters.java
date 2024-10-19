package Practice_01;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter inches");

        // double inches = scanner.nextDouble();
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;

        System.out.println("Conversion inch in cm: " + centimeters);
        scanner.close();
    }
}
