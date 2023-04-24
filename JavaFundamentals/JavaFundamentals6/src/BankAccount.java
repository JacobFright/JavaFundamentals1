public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid value");
            return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid value");
            return;
        }
        if (amount > balance) {
            System.out.println("You do not have this much");
            return;
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
