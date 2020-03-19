public class Teacher extends Employees implements Advisable {


    public Teacher(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        teach();
    }

    public void teach() {
        System.out.printf(getName() + " teacher is teaching!\n");
    }


    @Override                   //tin kanw gia na fygei to error tou implement (opws abstract)
    public void giveAdvice() {
        System.out.println(getName() + "Teacher is giving advice!");
    }
}
