package Practice_02;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter deposit amount");
        double depositAmount = scanner.nextDouble();
        System.out.println("Please, enter deposit term");
        int depositTerm = scanner.nextInt();
        System.out.println("Please, enter annual interest");
        double annualInterest = scanner.nextDouble();

        double annualInterestPercent = annualInterest / 100;

        double total = depositAmount + depositTerm * ((depositAmount * annualInterestPercent) / 12);

        System.out.println("Total amount is: " + total);
        scanner.close();
    }
}
