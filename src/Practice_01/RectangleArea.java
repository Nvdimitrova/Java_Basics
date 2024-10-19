package Practice_01;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter side a");
        // int sideA = Integer.parseInt.(scanner.nextLine());
        int sideA = scanner.nextInt();
        System.out.println("Please, enter side b");
        // int sideB = Integer.parseInt.(scanner.nextLine());
        int sideB = scanner.nextInt();

        int area = sideA * sideB;

        System.out.println("The area is: " + area);
        scanner.close();
    }
}
