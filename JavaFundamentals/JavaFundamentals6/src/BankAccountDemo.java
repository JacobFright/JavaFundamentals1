public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount jeff = new BankAccount("Jeff");
        BankAccount bob = new BankAccount("Bob", 1000);

        jeff.deposit(500);
        System.out.println(jeff.getOwner() + " balance: " + jeff.getBalance());

        jeff.withdraw(1000);

        bob.deposit(5000);
        System.out.println(bob.getOwner() + " balance: " + bob.getBalance());

    }
}
