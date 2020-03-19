//##Exercise2
//        1. Create class Employee with name and salary.
//        2. Create subclasses Teacher, Receptionist, Director
//        3. Teacher teach(), Receptionist greet(), Director guide()
//        4. Interfaces Advisable, Driving
//        5. Advisable has method giveAdvice(), Driving has method drive().
//        6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
//        7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
//        7a. Add abstract method work() in Employee.
//        7b. Each work() method will call the special method each Subclass has.
//        7c. Ask each employee to work().
//        8. Separate those that can drive from those that can advice.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employees teacher1 = new Teacher("George", 15000);
        Employees teacher2 = new Teacher("Xristina", 10000);
        Employees receptionist1 = new Receptionist("Paulos", 7000);
        Employees director1 = new Director("Dimitris", 25000);
        Employees director2 = new Director("Xristos", 40000);

        List<Employees> employees = new ArrayList<>();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist1);
        employees.add(director1);
        employees.add(director2);

        for (Employees employees1 : employees) {
            employees1.work();
        }

        List<Advisable> advisers = new ArrayList<>();
        List<Driving> drivers = new ArrayList<>();
        //how many advisers and how many drivers do we have
        System.out.println();
        System.out.println("********** Advisers **********");
        System.out.println();
        for (Employees employees1 : employees) {
            if (employees1 instanceof Advisable) {
                System.out.println(employees1.getName() + " is an Adviser!");
            }
        }
        System.out.println();
        System.out.println("********** Drivers **********");
        System.out.println();
        for (Employees employees1 : employees) {
            if (employees1 instanceof Driving) {
                System.out.println(employees1.getName() + " is a Driver!");
            }
        }
        System.out.println();
        System.out.println("********** Both Drivers and Advisers **********");
        System.out.println();
        for (Employees employees1 : employees) {
            if ((employees1 instanceof Driving) && (employees1 instanceof Advisable)) {
                System.out.println(employees1.getName() + " is both a Driver and an Adviser!");
            }
        }
    }
}
