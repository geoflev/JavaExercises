public class Ternary {

    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        String message = (age < 18) ? "You are a child!" : "You are adult!";
        System.out.println(message);
    }
}
