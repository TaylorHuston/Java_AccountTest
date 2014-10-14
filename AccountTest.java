/*
 * Very basic program to demonstrate accessing fields in a class
 * From "Java How To Program, 10/e, Early Objects" - Chapter 3
 */


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Taylor
 */
public class AccountTest {
    
    public static void main(String[] args) {
        //Scanner object to get data from user
        Scanner input = new Scanner(System.in);
        
        //Create new account with default constructor
        Account myAccount = new Account();
        
        System.out.printf("myAccount: %s %f %n%n", myAccount.getName(), myAccount.getBalance());
        
        //Prompt for new name
        System.out.println("Please enter a new name:");
        String newName = input.nextLine();
        System.out.println("Please enter a starting balance");
        double newBal = input.nextDouble();
        myAccount.setName(newName);
        myAccount.deposit(newBal);
        System.out.println();
        
        System.out.printf("myAccount: %s %f %n%n", myAccount.getName(), myAccount.getBalance());
        
        //Create two new accounts with pre-supplied data via constructor
        Account account1 = new Account("John Doe", 12.17);
        Account account2 = new Account("Jane Doe", 1846156.74);
        System.out.printf("account1: %s %f %n%n", account1.getName(), account1.getBalance());
        System.out.printf("account2: %s %f %n%n", account2.getName(), account2.getBalance());
        
        //Create third account via constructor and popup dialog boxes
        newName = JOptionPane.showInputDialog("Name of third account holder?");
        newBal = Double.parseDouble(JOptionPane.showInputDialog("Starting balance?"));
        Account account3 = new Account(newName, newBal);
        System.out.printf("account3: %s %f %n%n", account3.getName(), account3.getBalance());
        
        
    } //end Main
}//end AccountTest
