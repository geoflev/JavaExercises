import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassBootcamp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("**** Enter 3 bootcamps ****");
        ArrayList<Bootcamp> listOfBootcamps = new ArrayList<>();
        LocalDate dateFromStringStart = null;
        LocalDate dateFromStringEnd = null;
        for (int i = 0; i < 3; i++) {
            System.out.println("Whats the name of Bootcamp No." + (i + 1));
            String bootcampName = scanner.next();
            System.out.println("When does the Bootcamp start?");
            boolean success = false;
            String startDate;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            while (!success) {
                try {
                    startDate = scanner.next();
                    dateFromStringStart = LocalDate.parse(startDate, formatter);
                    success = true;
                } catch (DateTimeParseException ex) {
                    System.out.println("Please insert date in valid format! (dd/MM/yyyy)");
                }
            }
            System.out.println("When does the Bootcamp end?");
            success = false;
            String endDate;
            formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            while (!success) {
                try {
                    endDate = scanner.next();
                    dateFromStringStart = LocalDate.parse(endDate, formatter);
                    success = true;
                } catch (DateTimeParseException ex) {
                    System.out.println("Please insert date in valid format! (dd/MM/yyyy)");
                }
            }
            Bootcamp bootcamp = new Bootcamp(bootcampName, dateFromStringStart, dateFromStringEnd);
            listOfBootcamps.add(bootcamp);
        }
        System.out.println("Now,on what date do you want to check for availability?");
        boolean success = false;
        String clientDate;
        LocalDate dateFromStringClient = null;
        while (!success) {
            try {
                clientDate = scanner.next();
                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dateFromStringClient = LocalDate.parse(clientDate, formatter1);
                success = true;
            } catch (DateTimeParseException ex) {
                System.out.println("Please insert date in valid format! (dd/MM/yyyy)");
            }
        }
        for (Bootcamp bootcamp : listOfBootcamps) {

            if (dateFromStringClient.isAfter(bootcamp.getStartingDate()) && dateFromStringClient.isBefore(bootcamp.getEndingDate())) {
                System.out.println("Bootcamp " + bootcamp.getName() + " is available in " + dateFromStringClient + ". It starts "
                        + bootcamp.getStartingDate() + " and ends " + bootcamp.getEndingDate());
            } else {
                System.out.println("Sorry no bootcamp available in " + dateFromStringClient + " date!");
            }
        }
    }
}
//    Create a new program to exercise with LocalDates.
//        Create a class BootCamp.
//        This class has 3 variables
//        name: String
//        startingDate: LocalDate
//        endingDate: LocalDate
//        The program should ask the user to create three Bootcamps.
//        Ask for name, startingDate and endingDate for each one from the user (keyboard).
//        Store these Bootcamps in a list.
//        Then ask the user to enter a date. Check if a bootcamp will be available in that date and inform the user accordingly.
//        For example, if the user enters 10/10/2020 and a bootcamp is available, then the program should print a message:

//        Bootcamp SQL will be available in 10 Oct 2020. It starts 01 Oct 2020 and ends 30 Nov 2020.

//        Otherwise, the message will be: Sorry no bootcamp available in X date.
//        ***Catch any exceptions that might occur. Accepts only Dates in the format dd/MM/yyyy.
//        ***Try to use methods.