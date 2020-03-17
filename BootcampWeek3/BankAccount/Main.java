public class Main {
    public static void main(String[] args) {

        System.out.println("***** Bank Accounts Creation *****");
        BankAccount peiraiws = new BankAccount(12345, 50, "Piraeus", true);
        BankAccount ethiniki = new BankAccount(54321, 50, "NBG", true);
        peiraiws.createAccount();
        ethiniki.createAccount();
        peiraiws.deposit(150);
        peiraiws.withdraw(100);
        ethiniki.deposit(180);
        ethiniki.deposit(250);
        peiraiws.withdraw(5000);
        peiraiws.deposit(2000);
        peiraiws.withdraw(456);
        BankAccount.printArrayList();
    }
}
