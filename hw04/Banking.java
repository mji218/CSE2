//Michelle Iskandar
//CSE 002
//HW04 program #2
//2-12-15


import java.util.Scanner; //import a scanner
import java.lang.*; //import thingy

  public class Banking {  //start class 
      public static void main(String[] args) {  //main method
      
       Scanner myScanner; //declare scanner
       myScanner=new Scanner (System.in); //create instance that will take input
      
       double randomN= Math.random(); //generate random numbers
       double randomNumber= (randomN*4000)+1000;
       int currentBalance = (int) randomNumber;
       System.out.println("Balance $"+currentBalance); //show random number
      
      System.out.print("Would you like to deposit money, withdraw money, or view your balance?: "); //prompt user for an action
      String firstAction=myScanner.next(); //accepts user input
      
      switch ( firstAction ){
        case "deposit":
          System.out.print("How much money would you like to deposit?: "); //promt user for money
          int depositMoney=myScanner.nextInt(); //accept user input
              if (depositMoney<0) {
               System.out.println("You did not enter a proper number.");
               return; //leaves program
                        //program terminates
              }// end if deposite money statement
              else {
                int depositTotal=currentBalance+depositMoney; //get total balance
                System.out.println("Your current balance is $"+depositTotal+"."); //print total when deposit
              } //end else deposit statement   
         break; //break for deposit
        
          case "withdraw":
          System.out.print("How much money would you like to withdraw? "); 
          int withdrawMoney=myScanner.nextInt(); //accept user input
              if (withdrawMoney>currentBalance) {
                System.out.println("You do not have sufficient funds.");
                return;
              } //end if withdraw money statement
              else if (withdrawMoney<0) {
               System.out.println("You did not enter a proper number.");
               return; //leaves program
                        //program terminates
              }// end if deposite money statement  
              else { 
                int withdrawTotal=currentBalance-withdrawMoney; //get total balance
                System.out.println("Your current balance is $"+withdrawTotal+"."); //print total when withdrawn
              }// end else current balance statement
        break; //break for withdraw
        
        case "view balance":
          System.out.println("Your current balance is $"+currentBalance+"."); //print balance
        break; //break for view balance
        
        
      } //end action switch
      
      }//end main method
      
  }// end class