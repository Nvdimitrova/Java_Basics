package Practice_02;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter required amount of nylon");
        int nylon = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter required amount of paint");
        int paint = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter required amount of thinner");
        int thinner = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter the hours of which the work will be completed");
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint * 14.5) * 1.1;
        double thinnerPrice = thinner * 5.0;
        double bagsPrice = 0.4;

        double totalMaterialPrice = nylonPrice + paintPrice + thinnerPrice + bagsPrice;
        double craftsmanPrice = (totalMaterialPrice * 0.3) * hours;
        double totalPrice = totalMaterialPrice + craftsmanPrice;

        System.out.println("Total price for repainting will be: " + totalPrice);
        scanner.close();
    }
}
