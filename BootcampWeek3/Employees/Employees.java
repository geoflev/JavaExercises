public abstract class Employees {

    private String name;
    private int salary;


    public Employees(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void work();


    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
