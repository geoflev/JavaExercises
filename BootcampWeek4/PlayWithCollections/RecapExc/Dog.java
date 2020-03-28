public class Dog {

    private int number;

    public Dog(int number) {
        this.number = number;
    }

    public void bark(){
        System.out.printf("Dog number %d is barking!\n",number);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
