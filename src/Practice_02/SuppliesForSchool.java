package Practice_02;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter pens count");
        int pensCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter markers count");
        int markersCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter compound liters");
        int compoundLiters = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter discount percent");
        double discountPercent = Double.parseDouble(scanner.nextLine()) / 100;

        double pensPrice = 5.8;
        double markersPrice = 7.2;
        double compoundPrice = 1.2;

        double pensTotalPrice = pensCount * pensPrice;
        double markersTotalPrice = markersCount * markersPrice;
        double compoundTotalPrice = compoundLiters * compoundPrice;

        double totalPrice = pensTotalPrice + markersTotalPrice + compoundTotalPrice;
        double totalPriceDiscount = totalPrice - (totalPrice * discountPercent);

        System.out.println("Total price is: " + totalPriceDiscount);
        scanner.close();
    }
}
