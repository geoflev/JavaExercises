import java.util.Random;
import java.util.Scanner;

public class Classroom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        do {
            System.out.println("How many rows does the class have?");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            rows = scanner.nextInt();
        } while (rows <= 0);
        int students = 0;
        do {
            System.out.println("How many students does the class have?");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            students = scanner.nextInt();
        } while (students <= 0 || students < rows);
        int columns = 0;
        int restStudents = 0;
        if (students % rows == 0) {
            columns = students / rows;
        } else {
            columns = students / rows;
            restStudents = students % rows;
        }
        String[][] classroom = new String[rows][];
        for (int row = 0; row < rows - 1; row++) {
            classroom[row] = new String[columns];
        }
        classroom[rows - 1] = new String[columns + restStudents];

        int sumSeats = students;
        int occupiedSpots = 0;
        Random random = new Random();
        System.out.println("***** Let's book some seats! *****");
        System.out.println();
        while (occupiedSpots <= sumSeats) {
            int x = random.nextInt(classroom.length);
            int y = random.nextInt(classroom[x].length);
            if (classroom[x][y] == null) {
                System.out.printf("Please enter student's name for seat [%d][%d]?", x, y);
                classroom[x][y] = scanner.next();
                while (!classroom[x][y].matches("[a-zA-Z]+")) {
                    System.out.println("Please enter a valid name!");
                    classroom[x][y] = scanner.next();
                }
                occupiedSpots++;
                if (occupiedSpots == sumSeats) {
                    break;
                }
                if (sumSeats - occupiedSpots == 1) {
                    System.out.println("Only 1 seat left!!");
                } else {
                    System.out.println(sumSeats - occupiedSpots + " seats are empty!");
                }
            }
        }
        System.out.println("All seats are filled!Thank you!");
        System.out.println("***** Classroom preview *****");
        System.out.println();
        for (int row = 0; row < classroom.length; row++) {
            for (int column = 0; column < classroom[row].length; column++) {
                System.out.printf("%s\t", classroom[row][column]);
            }
            System.out.println();
        }
    }
}
