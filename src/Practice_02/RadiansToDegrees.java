package Practice_02;

import java.util.Scanner;

import static java.lang.Math.PI;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter radians");
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / PI;

        System.out.println("Radians in degrees: " + degrees);
        scanner.close();
    }
}
