//Michelle Iskandar
//CSE 002
//Run Factorial hw6
//3-2-15

import java.util.Scanner;
public class RunFactorial {
    public static void main(String[] args) {  //main method
 
          Scanner scan; //declare scanner
          scan=new Scanner (System.in); 
          int count=1;
          int end=1;
          
          System.out.print("Enter an integer that is between 9 and 16: "); //prompt user for input
          int intInt=0;
          
          if(scan.hasNextInt()) {
              intInt = scan.nextInt();
              
               if(intInt<9 || intInt>16) {
              System.out.println("Invalid Input, try again.");
               } //end if statement
                else {
                while(count<=intInt) {
                  end=end*count;
                  count++;
                } //end while statement

            System.out.println(intInt+"!= "+end);
                }//end nested else statement
          }//end first if statement
          
          else {
              System.out.println("Invalid input, try again.");
          }//end else statement        
          
          
          
    }// end main method
    
}//end class