package Practice_01;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number of packages of dog food");
        int dogFood = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter number of packages of cat food");
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = 2.5;
        double catFoodPrice = 4;

        double totalPrice = (dogFood * dogFoodPrice) + (catFood * catFoodPrice);

        System.out.println("Total price is: " + totalPrice + " lv.");
        scanner.close();
    }
}
