//Michelle Iskandar
//February 6 2015
//This program will compute the cost of buying Big Macs using a user input
//to display the total cost
//CSE 002 lab03

import java.util.Scanner; //import a scanner
  public class BigMac {   
      public static void main(String[] args) {  //main method
          
          Scanner myScanner; //declare scanner
          myScanner=new Scanner (System.in); //create instance that will take input
          
          System.out.print("Enter the number of Big Macs (an integer >0): "); //prompt user for number purchased
          int nBigMacs=myScanner.nextInt(); //accept user input
          System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): $"); //prompt user for price per
          double bigMac$=myScanner.nextDouble(); //accept user input
          System.out.print("Enter the percent tax as a whole number (xx): "); //prompt user for sales tax
          double taxRate=myScanner.nextDouble(); //accept user input
          
          taxRate/=100; //user enters percent, change to proportion
          
          double cost$; //define cost variable
          int dollars, dimes, pennies; //dollar amount of cost with proper decimals
          
          cost$=nBigMacs*bigMac$*(1+taxRate); //solve for the total cost
          dollars=(int)cost$; 
          dimes=(int)(cost$*10)%10;       
          pennies=(int)(cost$*100)%10;
          
          System.out.println("The total cost of "+nBigMacs+" Big Macs at $"+bigMac$+ " per Big Mac, with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+"."+dimes+pennies);
          
          
          
          
      } //end of main method
  } //end of class      
