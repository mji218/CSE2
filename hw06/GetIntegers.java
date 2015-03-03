//Michelle Iskandar
//CSE 002
//Get integers hw06
//3-2-15

import java.util.Scanner;
public class GetIntegers {
    public static void main(String[] args) {  //main method
 
          Scanner scan; //declare scanner
          scan=new Scanner (System.in); 
          
          System.out.print("Please enter 5 non-negative integers: ");
          int count; //declare a counter
          int sum5Ints=0;
          int intInt;
          
          for(count=0; count<5; count++) {
              if(scan.hasNextInt()) {
                  intInt=scan.nextInt(); 
                  if(intInt<0){
                      System.out.println("Invalid input, try again.");
                      return;
                  }//end other if statement
                  
              }//end if statement
              
              else { //if not an integer
                  System.out.println("Invalid Input, try again.");
                  return;
              } //end else statmeent
              sum5Ints= sum5Ints+intInt; 
              
          }//end for loop
          
          System.out.println("Sum is: "+sum5Ints);
          
    }//end main methid
    
}//end class