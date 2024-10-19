package Practice_05;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter animal type");
        String animal = scanner.nextLine();

        String type = "";

        switch (animal) {
            case "dog":
                type = "mammal";
                break;
            case "crocodile":
                type = "reptile";
                break;
            case "tortoise":
                type = "reptile";
                break;
            case "snake":
                type = "reptile";
                break;
            default:
                type = "unknown";
        }
        System.out.println(type);
        scanner.close();
    }
}
