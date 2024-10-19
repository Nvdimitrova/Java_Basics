package Practice_02;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter USD");
        double usdDollars = Double.parseDouble(scanner.nextLine());
        double bgnLev = usdDollars * 1.79549;

        System.out.println(usdDollars + " USD converted to BGN: " + bgnLev);
        scanner.close();
    }
}
