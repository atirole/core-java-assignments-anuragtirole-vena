package simple_banking_system_hands_on_task;
// CurrentAccount
class CurrentAccount extends BankAccount
{
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    //Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    //Override
    public void withdraw(double amount) {
        balance -= amount; // Overdraft allowed
        System.out.println("Withdrawn " + amount);
    }

    //Override
    public void showAccountType() {
        System.out.println("Account Type: Current Account");
    }
}
