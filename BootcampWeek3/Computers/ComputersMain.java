import java.util.ArrayList;
import java.util.List;

public class ComputersMain {

    public static void main(String[] args) {

        List<Computers> computersArrayList = new ArrayList<>();
        Desktop des1 = new Desktop("Sony", 5000, true);
        Laptop lap1 = new Laptop("Acer", 750, true);
        Tablet tab1 = new Tablet("Asus", 140, false);
        Desktop des2 = new Desktop("Lenovo", 4000, true);
        Laptop lap2 = new Laptop("Acer", 7040, true);
        Tablet tab2 = new Tablet("Asus", 120, false);
        Desktop des3 = new Desktop("Sony", 3500, true);
        Laptop lap3 = new Laptop("Acer", 7040, true);
        Tablet tab3 = new Tablet("Lenovo", 80, false);
        Desktop des4 = new Desktop("Sony", 3800, true);
        Desktop des5 = new Desktop(500);
        Desktop des6 = new Desktop(700);

        computersArrayList.add(des1);
        computersArrayList.add(lap1);
        computersArrayList.add(lap2);
        computersArrayList.add(tab1);
        computersArrayList.add(des2);
        computersArrayList.add(tab2);
        computersArrayList.add(des3);
        computersArrayList.add(lap3);
        computersArrayList.add(tab3);
        computersArrayList.add(des4);
        computersArrayList.add(des5);
        computersArrayList.add(des6);

        int sumSony = 0;
        int sumAcer = 0;
        int sumAsus = 0;
        int sumLenovo = 0;
        int sumUnknown = 0;
        int sumTotal = 0;

        for (Computers computers : computersArrayList) {
            if (computers.getBrand().equalsIgnoreCase("Sony")) {
                sumSony += computers.getPrice();
            } else if (computers.getBrand().equalsIgnoreCase("Acer")) {
                sumAcer += computers.getPrice();
            } else if (computers.getBrand().equalsIgnoreCase("Asus")) {
                sumAsus += computers.getPrice();
            } else if (computers.getBrand().equalsIgnoreCase("Lenovo")) {
                sumLenovo += computers.getPrice();
            } else {
                sumUnknown += computers.getPrice();
            }
        }
        System.out.println("*** Price Per Brand ***");
        System.out.println("The summary price of Sony devices is : " + sumSony);
        System.out.println("The summary price of Acer devices is : " + sumAcer);
        System.out.println("The summary price of Asus devices is : " + sumAsus);
        System.out.println("The summary price of Lenovo devices is : " + sumLenovo);
        System.out.println("The summary price of Unknown devices is : " + sumUnknown);

        System.out.println();
        System.out.println("*** Total Price ***");
        sumTotal = sumAcer + sumAsus + sumLenovo + sumSony + sumUnknown;
        System.out.println("Total price is : " + sumTotal);
        System.out.println("");
        System.out.println("*** Price Per Device ***");
        int sumLaptop = 0;
        int sumDesktop = 0;
        int sumTablet = 0;
        for (Computers computers : computersArrayList) {
            if (computers instanceof Desktop) {
                sumDesktop += computers.getPrice();
            } else if (computers instanceof Laptop) {    //koitaei ti einai stin kardia toy to object ti einai
                sumLaptop += computers.getPrice();
            } else if (computers instanceof Tablet) {
                sumTablet += computers.getPrice();
            }
        }
        System.out.printf("%s Computers cost %d$\n", "Laptop", sumLaptop);
        System.out.printf("%s Computers cost %d$\n", "Desktop", sumDesktop);
        System.out.printf("%s Computers cost %d$\n", "Tablet", sumTablet);
    }
}
//##Example
//        1. Create abstract class Computer ("brand", "price", "getPrice()", "getBrand()", "setBrand()").
//        Only "setPrice()" will be abstract. Subclasses Laptop, Desktop, Tablet.
//        1a. Tablet has hasBluetooth: boolean
//        Desktop has hasExtraLight: boolean
//        Laptop has hasWifi: boolean
//        1b. Brand can be Sony, Acer, Asus, Lenovo.
//        2. You can only specify "price", "brand" and extraCharacteristics while creating the object(use appropriate Constructors).
//        No class will have a default constructor.
//        All classes will have 2 constructors. One with "price" and one with "price-brand".
//        2a. If any PC has any extra characteristics, then setPrice() will add 20$ to the price.
//        3. Make 10 objects and store to list.
//        4. Get the sum of prices according to "brand". Print sum of each brand and print total.
//        5.Modify the program so that user(main method) cannot change the brand of the computer.
//        6.Get the sum of prices according to "object type".