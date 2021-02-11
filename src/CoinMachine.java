/*
 * Written by Donte Littlejohn
 */

import java.util.Scanner;

public class CoinMachine {
	  public static final int QUARTER_VAL = 25;
	  public static final int DIME_VAL = 10;
	  public static final int NICKEL_VAL = 5;
	  public static final int PENNY_VAL = 1;
	  
	  public static void main(String args[]) { 
	    Scanner keyboard = new Scanner(System.in);
	    int quarterAmt = 0;
	    String quarterMsg;
	    int dimeAmt = 0;
	    String dimeMsg;
	    int nickelAmt = 0;
	    String nickelMsg;
	    int pennyAmt = 0;
	    String pennyMsg;
	    
	    //Prompt for user for amount of change.
	    System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");
	    int change = keyboard.nextInt();
	    keyboard.nextLine();
	    System.out.println(change + " cents in coins:");
	    
	    //Check for quarters
        quarterAmt = change/QUARTER_VAL;
        quarterMsg = quarterAmt == 1 ? quarterAmt + " quarter" :  quarterAmt + " quarters";
        //Check for leftover change
        if(change % QUARTER_VAL != 0) 
        {
            change %= QUARTER_VAL;
        } 
        else 
        {
        	change = 0;
        }
        
	    //Check for dimes
        dimeAmt = change/DIME_VAL;
        dimeMsg = dimeAmt == 1 ? dimeAmt + " dime" :  dimeAmt + " dimes";
        //Check for leftover change
        if(change % DIME_VAL != 0) 
        {
            change %= DIME_VAL;
        } 
        else 
        {
        	change = 0;
        }
	    
	    //Check for nickels
        nickelAmt = change/NICKEL_VAL;
        nickelMsg = nickelAmt == 1 ? nickelAmt + " nickel" :  nickelAmt + " nickels";
        //Check for leftover change
        if(change % NICKEL_VAL != 0) 
        {
            change %= NICKEL_VAL;
        } 
        else 
        {
        	change = 0;
        }
	    
	    //Check for pennies
        pennyAmt = change/PENNY_VAL;
        pennyMsg = pennyAmt == 1 ? pennyAmt + " penny" :  pennyAmt + " pennies";
        
        
        //Print coin combinations to user
        System.out.println(quarterMsg + "\n" + dimeMsg + "\n" + nickelMsg + "\n" + pennyMsg);
	  } 
}
