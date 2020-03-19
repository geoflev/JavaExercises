public class Receptionist extends Employees implements Driving {


    public Receptionist(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        greet();
    }

    public void greet() {
        System.out.println(getName() + " receptionist is greeting!\n");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " receptionist is driving!");
    }
}
