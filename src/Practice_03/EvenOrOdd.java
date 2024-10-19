package Practice_03;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number");
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        scanner.close();
    }
}
