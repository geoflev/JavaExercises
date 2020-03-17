import java.util.ArrayList;

public class BankAccount {

    private int number;
    private double amount;
    private String name;
    private boolean active;
    private static ArrayList<String> transactions = new ArrayList<>();
    private static int accountsOpened;

    public BankAccount() {

    }

    public BankAccount(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public BankAccount(int number, double amount, String name, boolean active) {
        this.number = number;
        this.amount = amount;
        this.name = name;
        this.active = active;
    }

    public static void printArrayList() {
        System.out.println();
        System.out.println("***** Bank Transactions *****");
        System.out.println();
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    public void createAccount() {
        System.out.println();
        accountsOpened++;
        System.out.println("Account No." + accountsOpened + "\nAccount Number : "
                + number + "\n" + "Amount : " + amount + "\n" + "Name : " + name + "\n" + "Active : " + active);
        transactions.add(getName() + " Account - " + "Creation --> Number : " + number);


    }

    public void deposit(double amount) {
        this.amount += amount;
        //System.out.println("Deposit to " + getName() + " account is made.Amount is " + amount + "€. New balance is " + this.amount);
        transactions.add(getName() + " Account -" + "Deposit -->" + amount);
    }

    public void withdraw(double amount) {
        if (this.amount - amount < 0) {
            //System.out.println("Only " + this.amount + " available on " + getName()+ " account. Withdrawal not processed");
            transactions.add(getName() + " Account -" + " Withdraw not processed -->" + amount);
        } else {
            this.amount -= amount;
            //System.out.println("Withdraw to " + getName() + " account is made.Whithdraw amount is " + amount + "€. New balance is " + this.amount);
            transactions.add(getName() + " Account -" + " Withdraw -->" + amount);
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }


}
