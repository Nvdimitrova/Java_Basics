package Practice_04;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first competitor time");
        int timeFirst = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter second competitor time");
        int timeSecond = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter third competitor time");
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalSeconds = timeFirst + timeSecond + timeThird;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        if (seconds < 10) {
            System.out.printf("Total time is: " + "%d:0%d", minutes, seconds);
        } else {
            System.out.printf("Total time is: " + "%d:%d", minutes, seconds);
        }
        scanner.close();
    }
}
