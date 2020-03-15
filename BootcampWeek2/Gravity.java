import java.util.ArrayList;
import java.util.Scanner;

public class Gravity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> planets = new ArrayList<>();
        System.out.println("How much do you weight?");
        double kilograms = scanner.nextDouble();

        System.out.println("Choose a planet!");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        for(int i=0;i<planets.size();i++){
            System.out.println(i+1 + ". "+ planets.get(i));
        }
        int option;
        do {
            System.out.print("Please enter a number 1-6: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid character.\n", input);
            }
            option = scanner.nextInt();
        } while (option < 0);


        switch(option){
            case 1:
                System.out.printf("Your weight on Venus is %.1f\n!",  kilograms * 0.78 );
                break;
            case 2:
                System.out.printf("Your weight on Mars is %.1f!\n",  kilograms * 0.39);
                break;
            case 3:
                System.out.printf("Your weight on Jupiter is %.1f!\n",  kilograms * 2.65);
                break;
            case 4:
                System.out.printf("Your weight on Saturn is %.1f!\n",  kilograms * 1.17);
                break;
            case 5:
                System.out.printf("Your weight on Uranus is %.1f!\n",  kilograms * 1.05);
                break;
            case 6:
                System.out.printf("Your weight on Neptune is %.1f!\n",  kilograms * 1.23);
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
