package Practice_04;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter points");
        int points = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        if (points <= 100) {
            bonusPoints += 5;
        } else if (points > 1000) {
            bonusPoints = points * 0.1;
        } else {
            bonusPoints = points * 0.2;
        }

        if (points % 2 == 0) {
            bonusPoints += 1;
        } else if (points % 10 == 5) {
            bonusPoints += 2;
        }

        double totalPoints = points + bonusPoints;

        System.out.println("Bonus points: " + bonusPoints);
        System.out.println("Total points: " + totalPoints);
        scanner.close();
    }
}
