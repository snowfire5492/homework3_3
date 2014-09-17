package homework3_3;
/* 
 * Chapter No. 3    Excercise No. 3
 * File Name: homeWork3.java
 * @author: Eric Schenck
 * Date: September 16, 2012
 * 
 * 
 * Problem Statement: write a program that determines the change to be 
 * dispensed from a vending machine. An item in the machine can cost between
 * 25 cents and 1 dollar, in 5-cent increments, and the machine only accepts
 * 1 dollar bills to pay for the item. print out how many quarters, dimes,
 * and nickles must be dispensed. 
 * 
 * Overall plan:
 * 1.) ask user to input a price of an item
 * 2.) subract 100 from the user input, to a positive outcome
 * 3.) calculate the amount of quarters possible from the change
 * 4.) calculate the amount of nickels and dimes possible
 * 5.) print out the amount of change, and the amount of different change 
 * to be returned.
 *
 */
import java.util.Scanner;

public class HomeWork3_3 {
    
    public static final int QUARTER = 25;
    public static final int NICKEL = 5;
    public static final int DIME = 10;
    public static final int CASH = 100;
    
    public static void main(String[] args) {
        
        
        int userInput, change, numberOfQuarters, numberOfDimes;
        int numberOfNickels;
        
      
        
        Scanner keyboard = new Scanner(System.in);
        
            System.out.println(" Gumball:        25 cents");
            System.out.println(" Gummy Bears:    30 cents");
            System.out.println(" Pretzels:       35 cents");
            System.out.println(" Crackers:       40 cents");
            System.out.println(" Candy Bar:      45 cents");
            System.out.println(" Meat Stick:     50 cents");
            System.out.println(" Chips:          55 cents");
            System.out.println(" Cheesy Poofs:   60 cents");
            System.out.println(" Cracker Jack:   65 cents");
            System.out.println(" Yum Yum Bar:    70 cents");
            System.out.println(" Snicker Doodle: 75 cents");
            System.out.println(" RipOff Bar:     80 cents");
            System.out.println(" Gum Bar:        85 cents");
            System.out.println(" It's It Bar:    90 cents");
            System.out.println(" Rough Stuff:    95 cents");
            System.out.println(" Stolen Cash:   100 cents");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(" Enter the price of the item which you wish"
                    + " to buy:");
        
        
        
        userInput = keyboard.nextInt();
        
                
                change = CASH - userInput;
                
                numberOfQuarters = change / QUARTER;
                
                int changeInQuarters = QUARTER * numberOfQuarters;
                
                int firstRemainderChange = change - changeInQuarters;
                
                numberOfDimes = firstRemainderChange / DIME;
                
                int changeInDimes = DIME * numberOfDimes;
                
                int comboChange = changeInDimes + changeInQuarters;
                
                int finalChange = change - comboChange;
                
                numberOfNickels = finalChange / NICKEL;
                    
                    //print out the amount of change, quarters, dimes, and 
                    // nickels
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("You get " + change + " cents back");
                    System.out.println();
                    System.out.println("           Soooo........          ");
                    System.out.println();
                    System.out.println("You get " + numberOfQuarters 
                        + " Quarters");
                
                    System.out.println("You get " + numberOfDimes 
                        + " Dimes");
                
                    System.out.println("You get " + numberOfNickels
                        + " Nickels");
                
      
      
    }
}
