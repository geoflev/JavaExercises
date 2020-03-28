import java.util.*;

public class RecapExercises {

    public static void main(String[] args) {
        
        //dogYears();
        //starsPrintMethod();
        //namesArray();
        //numbersPattern();
        //sumOfDigits();
        //splitString();
        //checkCube();
        //calculateRectangle();
        //dogBarking();
        //statisticsNumber();

    }

    public static void statisticsNumber(){

        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Give me numbers to work with!");
        int number,sum = 0;
        int counter = 0;
        while(counter < 9){
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number!");
                    scanner.next();
                }
                number = scanner.nextInt();
                sum += number;
                integerList.add(number);
            } while (number <= 0);
            counter++;
        }
        System.out.println("Average is : " + sum/counter);
        Integer max = Collections.max(integerList);
        System.out.println("Max number is : " + max);
        Integer min = Collections.min(integerList);
        System.out.println("Min number is : " + min);
        //2-10 de to briskw me tipota
    }


//    Write a Java program to provide statistical information for an integer data set.
//    •The number of integer data points are given by the user from keyboard (between 2 and 10 numbers)
//    •Based on this input, the program should calculate:
//    Mean/Averagesum(all data points) / count of data pointsMaxthe largest
//    of all data pointsMinthe minimum of all data point


    public static void dogBarking() {

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(1));
        dogList.add(new Dog(2));
        dogList.add(new Dog(3));
        dogList.add(new Dog(4));
        dogList.add(new Dog(5));
        dogList.add(new Dog(6));
        dogList.add(new Dog(7));
        dogList.add(new Dog(8));
        dogList.add(new Dog(9));
        dogList.add(new Dog(10));

        Iterator<Dog> dogIterator = dogList.iterator();
        while (dogIterator.hasNext()) {
            Dog dog = dogIterator.next();
            dog.bark();
        }
    }

    public static void calculateRectangle() {

        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        double area1 = rectangle1.area();
        double area2 = rectangle2.area();
        System.out.println("Area of first Rectangle is : " + area1);
        System.out.println("Area of second Rectangle is : " + area2);
    }

    public static void splitString() {

        Scanner scanner = new Scanner(System.in);
        char ch;
        int sum = 0;
        System.out.println("Give me a String!");
        String wordGiven = scanner.nextLine();
        for (int i = 0; i < wordGiven.length(); i++) {
            ch = wordGiven.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
                    (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public static void starsPrintMethod() {
        int k = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 10; j > k; j--) {
                System.out.print("*");
            }
            k += 2;
            System.out.println();
        }
    }

    public static void dogYears() {
        Scanner scanner = new Scanner(System.in);
        int dogYears;
        do {
            System.out.println("Please enter a number!");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            dogYears = scanner.nextInt();
        } while (dogYears <= 0 || dogYears > 9);

        int calculatedDogYears = 4 + ((dogYears - 4) * 4);
        System.out.println("Age in dog years is : " + calculatedDogYears);
    }

    public static void namesArray() {

        String[] namesArray = {"Nikolas", "Anna", "Anastasia", "George", "Sofia", "Andrew", "Mary", "John"};
        for (String name : namesArray) {
            char firstLetter = name.charAt(0);
            if (firstLetter != 'A') {
                System.out.println(name);
            }
        }
    }

    public static void sumOfDigits() {

        int number, temp;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        number = scanner.nextInt();
        while (number > 0) {
            temp = number % 10;
            sum = sum + temp;
            number = number / 10;
        }
        System.out.println("The sum of numbers digits are :" + sum);

    }

    public static void checkCube() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int num = scanner.nextInt();
        int n = (int) Math.round(Math.pow(num, 1.0 / 3.0));
        if (num == n * n * n) {
            System.out.println("The number is a cube.");
        } else {
            System.out.println("The number is not a cube.");
        }
        System.out.println("\n");
    }
}



