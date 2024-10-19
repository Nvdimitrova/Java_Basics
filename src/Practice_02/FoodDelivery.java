package Practice_02;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number of chicken menus");
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter number of fish menus");
        int fishMenu = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter number of vegetarian menus");
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenusPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.4;
        double vegetarianMenuPrice = vegetarianMenu * 8.15;
        double deliveryPrice = 2.5;


        double menusPrice = chickenMenusPrice + fishMenuPrice + vegetarianMenuPrice;
        double dessertPrice = menusPrice * 0.2;
        double totalPrice = menusPrice + dessertPrice + deliveryPrice;

        System.out.println("Total price is: " + totalPrice);
        scanner.close();
    }
}
