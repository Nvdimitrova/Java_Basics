package Practice_03;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first number");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter second number");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber > secondNumber){
            System.out.println(firstNumber);
        }else {
            System.out.println("Greater number is: " + secondNumber);
        }
        scanner.close();
    }
}
