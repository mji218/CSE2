//Michelle Iskandar
//HW3 program 1
//CSE 002
//02/08/15

import java.util.Scanner; //import a scanner
  public class FourDigits {   
      public static void main(String[] args) {  //main method
          
          Scanner myScanner; //declare scanner
          myScanner=new Scanner (System.in); //create instance that will take input
          
          System.out.println("Enter a double with four digits after the decimal: "); //prompt user for a double
          double nDigits=myScanner.nextDouble(); //accept user input
          
          double nDigitsBig=nDigits*10000; //move all numbers to left of decimal
          int nDigitsInt=(int) nDigitsBig; //turn number into an integer
          
          int firstDigit= nDigitsInt % 10; //extract the last digit by finding the remainder
          int secondDigit=nDigitsInt/10 % 10; //extract second digit
          int thirdDigit=nDigitsInt/100 % 10; //extract third digit
          int fourthDigit=nDigitsInt/1000 % 10; //extract fourth digit
          
          System.out.println("The four digits are "+fourthDigit+thirdDigit+secondDigit+firstDigit); //print
          
      } //end main method
      
  } //end class    