import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String []args){
        Account account1 = new Account(1,"John",2000);
        Account account2 = new Account(2,"Peter",5000);
        Account account3 = new Account(3,"Kevin",6000);
        Account account4 = new Account(4,"Alex",8000);

        ATM atm = new ATM(2, account2);
        atm.chooseOptions();
    }
}

public class Account {
    public int accountNumber;
    public String customerName;
    public int balance;
    public Account(int accountNumber, String customerName, int initialDeposit) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialDeposit;
    }
    public void deposit(int depositAmount) {
        balance+=depositAmount;
        showBalance();
    }
    public void withdraw(int withdrawAmount) {
        if(withdrawAmount < balance) balance-=withdrawAmount;
        else System.out.println("Insufficient Balance");
        showBalance();
    }
    public void showBalance() {
        System.out.println("Your Account current Balance is "+balance);
    }
}

public class ATM {


    static int balanceOfATM = 30000;
    //The balance in the ATM machine is not going to change depends on the object,
    // so it's a good example of Static Variable.
    
    
    private int accountNumber;
    public Account accountObject;
    public ATM (int accountNumber, Account accountObject) {
        this.accountNumber = accountNumber;
        this.accountObject = accountObject;
        System.out.println("Hello "+accountObject.customerName);
    }
    static Scanner scan = new Scanner(System.in);
    public void chooseOptions() {
        System.out.println("Welcome to XYZ Bank!");
        System.out.println("Enter a number 1.Deposit 2.Withdraw 3.Show Balance 4.Exit");
        int choice = scan.nextInt();
        switch(choice) {
            case 1 : System.out.println("Enter the amount to be deposited");
                     int depositAmount = scan.nextInt();
                     deposit(depositAmount);
                     break;
            case 2 : System.out.println("Enter the amount to be withdrawn");
                     int withdrawAmount = scan.nextInt();
                     withdraw(withdrawAmount);
                     break;
            case 3 : accountObject.showBalance();
                     break;
            case 4:
            default : System.exit(0);
        }
    }
    public void deposit(int depositAmount) {
        balanceOfATM+=depositAmount;
        accountObject.deposit(depositAmount);
        System.out.println("Deposit Successful");
    }
    public void withdraw(int withdrawAmount) {
        if(accountObject.balance > withdrawAmount &&
           balanceOfATM > withdrawAmount) {
            balanceOfATM-=withdrawAmount;
            accountObject.withdraw(withdrawAmount);
            System.out.println("Withdrawn Successful");
        }
        else if(accountObject.balance < withdrawAmount) System.out.println("Insufficient Balance in your account!");
        else System.out.println("Insufficient Balance in the ATM Machine. Sorry for the inconvenience!");
    }
    
    
    public static void showATMBalance() {
        System.out.println("ATM Balance is "+balanceOfATM);
    }
    
    
    //Show ATM Balance can only be accessed by the Security Officer and not any users.
    //It does not depends on any object which is used, so it is a static method.
}