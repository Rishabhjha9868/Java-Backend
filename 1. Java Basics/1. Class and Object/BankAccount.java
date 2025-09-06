public class BankAccount {
    // Attributes: account_number, account_holder, balance
    private long account_number;
    private String account_holder;
    private double balance;

    // Constructor
    BankAccount(long account_number, String account_holder, double balance){
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    // Methods:  deposit(amount), withdraw(amount) → should not allow withdrawal beyond balance ,display_balance()
    public void deposit(double amount) {
       balance += amount;
       System.out.println("Your current account balance is " + balance);
   }

   public void withdraw(double amount){
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawl successfully");
        System.out.println("Your current account balance is " + balance);
        } else {
            System.out.println("Insufficient Balance!!!");
        }
   }

   public void display_balance() {
       System.out.println("Your current account balance is " + balance);
   }
}
