public class Director extends Employees implements Advisable, Driving {


    public Director(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        guide();
    }


    public void guide() {
        System.out.printf(getName() + " director is guiding!\n");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName() + " director is advising!");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " director is driving!");
    }
}
