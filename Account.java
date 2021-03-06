/*
 * Very basic program to demonstrate accessing fields in a class
 * From "Java How To Program, 10/e, Early Objects" - Chapter 3
 */

public class Account {
    private String name;
    private double balance;
    
    //Constructors
    public Account(String newName, double startBalance) {
        this.name = newName;
        
        if (startBalance > 0.0) {
            this.balance = startBalance;
        } else {
            this.balance = 0.0;
        }
    }
    
    public Account() {
        this.name = null;
        this.balance = 0.0;
    } 

    //Setters and Getters
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return this.name;
    }

    public void deposit(double toDeposit) {
        if (toDeposit > 0.0) {
            this.balance += toDeposit;
        }
    } 
    
    public double getBalance() {
        return this.balance;
    } 
} //End Account
