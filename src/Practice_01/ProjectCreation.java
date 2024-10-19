package Practice_01;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter architect name");
        String architectName = scanner.nextLine();
        System.out.println("Please, enter number of projects");
        int numberOfProjects = Integer.parseInt(scanner.nextLine());

        int totalTime = numberOfProjects * 3;

        System.out.println("The architect " + architectName
                + " " + "will need " + totalTime + " "
                + "hours to complete "
                + numberOfProjects + " project/s" + ".");
        scanner.close();
    }
}

