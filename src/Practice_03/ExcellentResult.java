package Practice_03;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your result");
        int result = Integer.parseInt(scanner.nextLine());

        if (result >= 5){
            System.out.println("Excellent!");
        }else
            System.out.println("Practice more and try again");
        scanner.close();
    }
}
