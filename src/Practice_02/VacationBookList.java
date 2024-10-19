package Practice_02;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number of pages of the book");
        int pages = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter how many pages you read per hour");
        int pagesForOneHour = Integer.parseInt(scanner.nextLine());
        System.out.println("Please, enter the days that you have for this book");
        int days = Integer.parseInt(scanner.nextLine());

        int totalTimeForBook = (pages / pagesForOneHour) / days;

        System.out.println("The total time for this book will be: " + totalTimeForBook + " days");
        scanner.close();
    }
}
