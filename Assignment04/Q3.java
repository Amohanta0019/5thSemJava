/*Assume that a bank maintains two kinds of account for its customers, one called savings account and other called current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance (say Rs. 1000) and if the balance falls below this level a service charge is imposed (say Rs. 100).
Create a class Account that stores customer name, account number and type of account. From this class derive two classes Curr_Acct and Savn_Acct respectively to make them more specific to their requirements. Include the necessary methods to achieve the following tasks:
a. Accept deposit from a customer and update the balance.
b. Display the balance.
c. Compute and deposit interest.
d. Permit withdrawal and update the balance.
e. Check for minimum balance, impose penalty, if necessary, and update the balance.
Use constructors to initialize the class members.*/

class Account {
    String customer_name;
    int account_number;
    String type_of_account;
    double balance;

    Account(String customer_name, int account_number, String type_of_account, double balance) {
        this.customer_name = customer_name;
        this.account_number = account_number;
        this.type_of_account = type_of_account;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + customer_name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Type: " + type_of_account);
        System.out.println("Balance: Rs. " + balance);
    }
}

class Curr_Acct extends Account {
    private final double minBalance = 1000.0; 
    private final double serviceCharge = 100.0; 

    public Curr_Acct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current Account", balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance for withdrawal!");
        }
    }

    private void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Balance fell below minimum. Service charge imposed: Rs. " + serviceCharge);
        }
    }
}

class Savn_Acct extends Account {
    private final double interestRate = 4.0; // Annual interest rate

    public Savn_Acct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Savings Account", balance);
    }

    public void computeAndDepositInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Deposited: Rs. " + interest);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal!");
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Savn_Acct savings = new Savn_Acct("AAA", 101, 5000);
        System.out.println("Savings Account Operations:");
        savings.displayBalance();
        savings.deposit(2000);
        savings.computeAndDepositInterest();
        savings.withdraw(3000);
        savings.displayBalance();

        System.out.println();

        // Create a Current Account
        Curr_Acct current = new Curr_Acct("BBB", 102, 1500);
        System.out.println("Current Account Operations:");
        current.displayBalance();
        current.deposit(500);
        current.withdraw(1200); 
        current.displayBalance();
        current.withdraw(500); 
        current.displayBalance();
    }
}
