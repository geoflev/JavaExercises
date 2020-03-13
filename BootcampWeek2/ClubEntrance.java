import java.util.ArrayList;
import java.util.Scanner;

public class ClubEntrance {



    public static void main(String[] args) {

        String name = getName();
        String gender = getGender(name);
        int age = getAge(name);
        getSeason(name);
        getHeightWeight(name);
        int luckyDay = findLuckyDay(age);
        enterToTheClub(age, luckyDay, name, gender);
    }

    public static String getName() {
        System.out.println("******** Inserting Name *********");
        System.out.println("Hello,whats your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        while(!name.matches("[a-zA-Z]+")){
            System.out.println("Please enter a valid name!");
            name = scanner.next();
        }
        System.out.println("Hello " + name + "!");
        return name;
    }

    public static String getGender(String name) {
        System.out.println("******** Inserting Gender *********");
        System.out.println("Are you male or female "+ name +"? (M/F)");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        while (!("M".equalsIgnoreCase(gender) || "F".equalsIgnoreCase(gender))) {
            System.out.println("Incorrect.Try again!");
            gender = scanner.next();
        }
        if (gender.equals("M") || gender.equals("m")) {
            gender = "Male";
            return gender;
        } else {
            gender = "Female";
            return gender;
        }
    }

    public static int getAge(String name) {
        System.out.println("******** Inserting Age *********");
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Whats your age " + name + " ?");
        do {
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("Character \"%s\" is not a valid number.\n", input);
            }
            System.out.println("Please enter a valid age!");
            number = scanner.nextInt();
        } while (number < 0 || number > 110);
        int age = number;

        if (age <= 5) {
            System.out.println("You are too young for this app!");
            System.out.println("Come back in " + (6 - age) + " years when you will be a student.");
        } else if (age <= 18) {
            System.out.println("Oh you are a student");
            System.out.println("Keep up... " + (18 - age) + " more years left and afterwards you will make money.");
        } else if (age < 40) {
            System.out.println("Well, you must be employed.");
            System.out.println("You finished school " + (age - 18) + " years ago.");
        } else {
            System.out.println("You are too old for this app!");
        }
        int yearOfBirth = 2020 - age;
        int ageBackAgo = 1980 - yearOfBirth;

        if (ageBackAgo < 0) {
            System.out.println("You weren't born in 1980");
            System.out.println("In 2040 you will be " + (2040 - yearOfBirth) + " years old.");
        } else {
            System.out.println("Back in 1980 you were " + ageBackAgo);
            System.out.println("In 2040 you will be " + (2040 - yearOfBirth) + " years old.");
        }

        return age;
    }

    public static void getSeason(String name) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> seasonList = new ArrayList<>();
        System.out.println();
        System.out.println("******* Favourite Season *******");
        System.out.println("Whats your favourite season " + name + "?");
        seasonList.add("1. Winter");
        seasonList.add("2. Spring");
        seasonList.add("3. Summer");
        seasonList.add("4. Autumn");

        for (int i = 0; i < 4; i++) {
            System.out.println(seasonList.get(i));
        }
        int number;
        do {
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("Character \"%s\" is not a valid number.\n", input);
            }
            System.out.println("Please enter a valid number!");
            number = scanner.nextInt();
        } while ((number < 0) || (number > 4));
        int favSeason = number;
        if (favSeason == 1) {
            System.out.println("It must be cold outside");
        } else if (favSeason == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        } else if (favSeason == 3) {
            System.out.println("Let's go for swimming");
        } else {
            System.out.println("The trees are full of brown leaves");
        }

    }

    public static void getHeightWeight(String name) {

        Scanner scanner = new Scanner(System.in);
        double heightRead;
        System.out.println();
        System.out.println("******* Getting height and weight ******");

        System.out.println("Whats your height " + name + "?");
        do {
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.printf("Character \"%s\" is not a valid number.\n", input);
            }
            System.out.println("Please enter a valid height!");
            heightRead = scanner.nextDouble();
        } while (heightRead <= 0.0 || heightRead > 2.50);

        double weightRead;
        System.out.println("Whats your weight " + name + "?");
        do {
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.printf("Character \"%s\" is not a valid number.\n", input);
            }
            System.out.println("Please enter a valid weight!");
            weightRead = scanner.nextDouble();
        } while (weightRead <= 0.0 || weightRead > 250.0);

        double weight = weightRead;
        double height = heightRead;
        double BMI = weight / (height * height);

        System.out.println();
        System.out.println("******* BMI Calculation ******");
        System.out.printf("Your BMI is : %.2f\n",BMI);
        if (BMI < 0)
            System.out.println("Wrong result");
        else if (BMI < 18.5)
            System.out.println("You are Underweight");
        else if ((BMI >= 18.5) && (BMI < 24.9))
            System.out.println("You are Normal weight");
        else if ((BMI >= 25) && (BMI < 29.9))
            System.out.println("You are overweight");
        else
            System.out.println("Obesity");
    }


    public static int findLuckyDay(int age) {

        int ageToDays = age * 365;
        int temp, sum = 0;
        System.out.println();
        System.out.println("******* Calculate Lucky day *******");
        while (ageToDays > 0) {
            temp = ageToDays % 10;
            sum = sum + temp;
            ageToDays = ageToDays / 10;
        }
        if (sum % 7 == 0) {
            System.out.println("Your lucky day is Monday");
            return 0;
        } else if (sum % 7 == 1) {
            System.out.println("Your lucky day is Tuesday");
            return 1;
        } else if (sum % 7 == 2) {
            System.out.println("Your lucky day is Wednesday");
            return 2;
        } else if (sum % 7 == 3) {
            System.out.println("Your lucky day is Thursday");
            return 3;
        } else if (sum % 7 == 4) {
            System.out.println("Your lucky day is Friday");
            return 4;
        } else if (sum % 7 == 5) {
            System.out.println("Your lucky day is Saturday");
            return 5;
        } else {
            System.out.println("Your lucky day is Sunday");
            return 6;
        }
    }

    public static void enterToTheClub(int age, int luckyDay, String name, String gender) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("******* Club Entrance *******");
        if ((age >= 20) && (age <= 40) && (luckyDay == 2)) {
            if (age <= 25) {
                System.out.println("Welcome " + name);
            } else if (gender.equals("Male")) {                         //KOITA TO
                System.out.println("Welcome Mr. " + name);
            } else if (gender.equals("Female")) {
                System.out.println("Are you married Ms or Mrs " + name + "?");
                String answerNew = scanner.next();
                while (!("Yes".equalsIgnoreCase(answerNew) || "No".equalsIgnoreCase(answerNew))) {
                    System.out.println("Incorrect.Try again!");
                    answerNew = scanner.next();
                }
                if (answerNew.equalsIgnoreCase("Yes")) {
                    System.out.println("Ok then, welcome Mrs. " + name);
                } else {
                    System.out.println("Ok then, welcome Ms. " + name);
                }
            }
        } else {
            System.out.println("There's no way you enter the club today!");
            if (luckyDay != 2) {
                if ((age >= 20) && (age <= 40)) {
                    System.out.println("Your lucky day is wrong!");
                } else
                    System.out.println("Your lucky day and your age are wrong");
            } else {
                if (age < 20)
                    System.out.println("You are too young!");
                else
                    System.out.println("You are too old!");
            }
        }
    }
}
