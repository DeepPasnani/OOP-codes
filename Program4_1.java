class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    void openAccount(String accountNumber, String accountHolderName, double initialDeposit) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        System.out.println("Account opened for: " + accountHolderName + "Account No: " + accountNumber + "Initial Balance: " + initialDeposit);
    }

    void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount + "New Balance: " + balance);
    }

    double withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + "Remaining Balance: " + balance);
            return amount;
        } 
        else 
        {
            System.out.println("Insufficient balance. Withdrawal of " + amount + " denied.");
            return 0;
        }
    }

    double checkBalance() 
    {
        return balance;
    }
}

class SavingAccount extends BankAccount 
{
    double calculateInterest(double interestRate, int years) 
    {
        double principal = checkBalance();
        return principal * Math.pow(1 + interestRate / 100, years) - principal;
    }
}

class FixedDepositAccount extends BankAccount 
{
    double maturityAmount(double interestRate, int years) 
    {
        return checkBalance() * Math.pow(1 + interestRate / 100, years);
    }
}

public class Program4_1 
{
    public static void main(String args[]) 
    {
        System.out.println("===== Saving Account =====");
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA001", "Alice", 10000);
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println("Current Balance : " + sa.checkBalance());
        System.out.println("Interest Earned (5% for 3 years): " + sa.calculateInterest(5, 3));

        System.out.println();

        System.out.println("===== Fixed Deposit Account =====");
        FixedDepositAccount fda = new FixedDepositAccount();
        fda.openAccount("FD001", "Bob", 50000);
        System.out.println("Current Balance : " + fda.checkBalance());
        System.out.println("Maturity Amount (6% for 5 years): " + fda.maturityAmount(6, 5));
    }
}
