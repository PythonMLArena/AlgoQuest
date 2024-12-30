import java.util.*;
import java.lang.*;
import java.io.*;

class BankAccount {
    private double balance;
    String AccountType;
    private double age;

    public BankAccount() { // default constructor
       System.out.println(" we are here too.");
    }

    public BankAccount(double _balance) {
        balance = _balance;
    }


    public BankAccount(double balance, String AccountType) { // contructor will be called based on number of inputs matched 
        this.balance = balance;
        this.AccountType = AccountType;
    }

    public void printAccountType(){
        System.out.println(this.AccountType);
    }

    public void printBalance(){
        System.out.println(this.balance);
    }
}

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankAccount acc1 = new BankAccount(); // always check for method name same as class name that will be default constructor
        acc1.printAccountType();
        acc1.printBalance();

        BankAccount acc2 = new BankAccount(100.0); // checked and find out constructor based on number of arguments. and run that arguments
        acc2.printAccountType();
        acc2.printBalance();
        acc2.printBalance=10; // cant be happen because its a private variable , Encapsulation provide methods to change variables, make variables private so outer world can access easily and modify
        System.out.println(acc2.balance);

        

        
    }
}