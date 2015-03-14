//Michelle Iskandar
//CSE 002
//Zig zag lab7
//3-6-15

import java.util.Scanner;
public class zigzag {
    public static void main(String[] args) {  //main method
 
          Scanner scan; //declare scanner
          scan=new Scanner (System.in); 
          
    
          int nStars=1;
          int control;
          int cap;
          int times=1;
          
          while(times>0){
          
          while(nStars<3 || nStars>33){
             System.out.print("Enter an int between 3 and 33: "); //prompt user for int
             
            while(!scan.hasNextInt()){
                scan.next();
              System.out.print("Not an Integer. Enter int between 3 and 33: ");
              
            }//end while an integer
            nStars=scan.nextInt();
          }//end big while
          
         control=0;
          while(control<nStars){
              System.out.print("*");
              control++;
          }//end while (line) statement
          System.out.println("");
          control=1;
          while(control<(nStars-1)){
                cap=0;
                while(cap<control){
                    System.out.print(" ");
                    cap++;
                }//end nested while statement
              System.out.println("*");
              control++;
          }//end while statement
          control=0;
          while(control<nStars){
              System.out.print("*");
              control++;
          }//end 2nd while (line) statement
          System.out.println("");

          
          }//end biggggg while loop
          
          
    }//end main method
}//end class
          
          
          
          
          
  