import java.util.ArrayList;
import java.util.Scanner;

public class Exercises_12_3_2020 {

    public static void main(String[] args) {

        AreaAndPerimeter(7.5);
        XandYOperations((byte) 1, (byte) 2);
        printAreaOfRectangle(5.6f, 8.5f);
        secondsToHour(720000061);
        NamesYearsOfBirth();
        TempConvert(85);
        InchToMeters(1500);
        SalesCalc(10);

    }

    public static void AreaAndPerimeter(double radius) {

        System.out.println();
        System.out.println("****** Area and Perimeter Calculation ****** ");
        System.out.println();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimeter is : %.14f \n", perimeter);
        System.out.printf("Area is : %.14f \n", area);
        //Otan ta ekana float den epairna to swsto output
    }

    public static void XandYOperations(byte x, byte y) {

        System.out.println();
        System.out.println("****** X and Y Operations ******");
        System.out.println();
        System.out.println("x = " + x + "," + "y = " + y);
        System.out.println();
        System.out.println("-x + x++ * 2 = " + (-x + x++ * 2));
        System.out.println("x = " + x + "," + "y = " + y);
        System.out.println();
        System.out.println("(x++ + --y) + --y = " + ((x++ + --y) + --y));
        System.out.println("x = " + x + "," + "y = " + y);
        System.out.println();
        System.out.println("x + x = " + (x + x));
        System.out.println("x = " + x + "," + "y = " + y);
    }

    public static void printAreaOfRectangle(float width, float height) {

        System.out.println();
        System.out.println("****** Area of Rectangle ******");
        System.out.println();
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f\n", width, height, perimeter);
        //me Area 5.6 opws sto teams
    }

    public static void secondsToHour(int seconds) {
        System.out.println();
        System.out.println("****** Seconds to Hours ******");
        System.out.println();
        int myHours = seconds / 3600;
        short myMinutes = (short) ((seconds % 3600) / 60);
        short mySeconds = (short) (seconds % 60);
        System.out.println(seconds + " seconds are : " + myHours + " hours ," + myMinutes + " minutes ," + mySeconds + " seconds!");
    }

    public static void NamesYearsOfBirth() {
        System.out.println();
        System.out.println("****** Name and age ******");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesArrayList = new ArrayList<>();
        ArrayList<Integer> agesArrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter your name person No." + (i + 1));
            String name = scanner.next();
            namesArrayList.add(name);
            System.out.println("Enter your year of birth");
            int age = scanner.nextInt();
            agesArrayList.add(age);
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("1st person name is " + namesArrayList.get(i)
                        + " and his year of birth is " + agesArrayList.get(i));
            } else if (i == 1) {
                System.out.println("2nd person name is " + namesArrayList.get(i)
                        + " and his year of birth is " + agesArrayList.get(i));
            } else {
                System.out.println("3rd person name is " + namesArrayList.get(i)
                        + " and his year of birth is " + agesArrayList.get(i));
            }
        }
    }

    public static void TempConvert(float fahrTemp) {
        System.out.println();
        System.out.println("****** Fahrenheit to Celcius ****** ");
        System.out.println();
        float celsius = (float) ((5 * (fahrTemp - 32.0)) / 9.0);
        System.out.printf("%.1f Fahrenheit is equal to %.1f celcius!", fahrTemp, celsius);

    }

    public static void InchToMeters(int inches) {
        System.out.println();
        System.out.println("****** Inches to meters ******");
        System.out.println();
        float meters = inches * (float) 0.0254;
        System.out.printf("%d inches are equal to %.1f meters!", inches, meters);
    }

    public static void SalesCalc(int price) {
        System.out.println();
        System.out.println("****** Sales ******");
        System.out.println();
        for (int i = 0; i < 6; i++) {
            short discount = (short) ((i + 1) * 10);
            short totalToPay = (short) (100 - discount);
            int amount = (totalToPay * price) / 100;
            System.out.printf("Product with original price %d€ at %d0 percent discount costs %d€! \n", price, i + 1, amount);
        }
        //se ola panw apo 10000000 kanei OF me int
    }


}













