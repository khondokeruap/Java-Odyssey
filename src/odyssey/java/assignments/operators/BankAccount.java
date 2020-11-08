package src.odyssey.java.assignments.operators;

public class BankAccount {
    //Fields
    String accountNumber; //121-5454-546786  // 123-25-7890
    String accountHolderName;
    String accountType;
    double balance;


    public BankAccount(){
        this.accountNumber = "111-222-333";
        this.accountHolderName = "Some Name";
        this.accountType = "Checking";
        this.balance = 0.0;
    }

    public BankAccount(String accNumber, String name){
        this.accountNumber = accNumber;
        this.accountHolderName = name;
        this.accountType = "Checking";
        this.balance = 0.0;
    }

    public BankAccount(String accNumber, String name, double amount){
        this.accountNumber = accNumber;
        this.accountHolderName = name;
        this.accountType = "Checking";
        this.balance = amount;
    }



    //Methods
    public void deposite(double amount){

    }

    public void withdraw(double amount){

    }

    public void printStatement(){
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: $"+ this.balance);
    }

}
