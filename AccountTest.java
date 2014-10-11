/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Taylor
 */
public class AccountTest {
    
    public static void main(String[] args) {
        //Scanner object to get data from user
        Scanner input = new Scanner(System.in);
        
        //Account object to manipulate
        Account myAccount = new Account();
        
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        //Prompt for new name
        System.out.println("Please enter a new name:");
        String newName = input.nextLine();
        myAccount.setName(newName);
        System.out.println();
        
        System.out.printf("New name is: %s%n%n", myAccount.getName());
    } //end Main
}//end AccountTest
