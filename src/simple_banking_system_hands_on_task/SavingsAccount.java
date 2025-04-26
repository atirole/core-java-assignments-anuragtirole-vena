package simple_banking_system_hands_on_task;
// SavingsAccount
class SavingsAccount extends BankAccount
{
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    //Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    //Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    //Override
    public void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
