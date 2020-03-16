import java.io.*;
import java.util.Scanner;

public class FileExcFamily {
    public static void main(String[] args) throws IOException {

        String filename = "/Users/geoflev/IdeaProjects/Family.txt";
        File file = new File(filename);
        addFamilyMember(file);
        readFromFile(file);
    }

    public static void readFromFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

    public static void addFamilyMember(File file) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String quit = "Exit";
        String option;
        FileWriter fileWriter = new FileWriter(file, true); //Set true for append mode
        PrintWriter writer = new PrintWriter(fileWriter);
        String firstLine = "NAME\t" + "AGE\t" + "HEIGHT(m)\t" + "WEIGHT(kg)\t\n";
        writer.print(firstLine);
        while (quit.equals("Exit")) {
            System.out.println("What's the name of your family member?");
            String name = scanner.next();
            while (!name.matches("[a-zA-Z]+")) {
                System.out.println("Please enter a valid name!");
                name = scanner.next();
            }
            writer.print(name + "\t");
            int age;
            do {
                System.out.println("What's the age of " + name + "?");
                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter a number:");
                    scanner.next();
                }
                age = scanner.nextInt();
            } while (age < 0 || age > 100);
            writer.print(age + "\t");

            double height;
            do {
                System.out.println("What's the height?");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Please enter a number:");
                    scanner.next();
                }
                height = scanner.nextDouble();
            } while (height < 0.0 || height > 2.50);
            writer.print(height + "\t\t");
            int weight;
            do {
                System.out.println("What's the weight?");
                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter a number:");
                    scanner.next();
                }
                weight = scanner.nextInt();
            } while (weight < 0 || weight > 250);
            writer.print(weight + "\t");

            writer.print("\n");
            System.out.println("Person was successfully created");
            System.out.println("Press anything to add another family member or type \"exit\" to exit..");
            option = scanner.next();
            if (quit.equalsIgnoreCase(option)) {
                break;
            }
        }
        writer.close();
        fileWriter.close();
        scanner.close();
    }
}
