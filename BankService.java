public class BankService {

    static class BankAccount {
        double balance = 5000;

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.println("Initial Balance: " + acc.balance);

        acc.deposit(500);
        System.out.println("After Deposit: " + acc.balance);

        acc.withdraw(200);
        System.out.println("After Withdrawal: " + acc.balance);
    }
}