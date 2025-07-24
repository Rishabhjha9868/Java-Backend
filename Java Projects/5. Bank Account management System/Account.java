public class Account {

    // attributes
    private String name;
    private double number;
    private double balance;

    // constructor
    Account(){
        System.out.println("This is Parent class");
    }

    // parametrized constructor
    Account(String name, double number, double balance){
        this.balance = balance;
        this.name = name;
        this.number = number;
    }

    // methods
    public void displayInfo(){
        System.out.println("Account Holder name is " + name);
        System.out.println("Account Number is "+ number);
        System.out.println("And The balance is " + balance);
    }
}