//Michelle Iskandar
//HW3 program 2
//CSE 002
//02/05/15

import java.util.Scanner; //import a scanner
  public class Root {   
      public static void main(String[] args) {  //main method
          
          Scanner myScanner; //declare scanner
          myScanner=new Scanner (System.in); //create instance that will take input
          
          System.out.print("Enter a double: "); //prompts user for input
          double nNumber=myScanner.nextDouble(); //accepts user input
          double guess1=nNumber/3; //first guess
          double guess2=(2*guess1*guess1*guess1+nNumber)/(3*guess1*guess1); //second guess
          double guess3=(2*guess2*guess2*guess2+nNumber)/(3*guess2*guess2); //third guess
          double guess4=(2*guess3*guess3*guess3+nNumber)/(3*guess3*guess3); //fourth guess
          double guess5=(2*guess4*guess4*guess4+nNumber)/(3*guess4*guess4); //fifth guess
          double guess6=(2*guess5*guess5*guess5+nNumber)/(3*guess5*guess5); //sixth guess
          double integer=guess6*guess6*guess6; //give the original number
          
          System.out.println("The cube root is "+guess6); //print the cube root
          System.out.println(guess6+"*"+guess6+"*"+guess6+" = "+integer); //print statement
          
      } //end main method
      
  } //end class  