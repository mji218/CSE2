//Michelle Iskandar
//CSE 002
//Smile Generator lab06
//2-27-15

import java.util.Random;

public class SmileGenerator {
    public static void main(String[] args) {  //main method
    
    int counter=1;
    
    //Step 4
    int rand= (int) (Math.random()*100)+1;
    
    while (counter<=rand) {
       int cap=0;
       while (cap < counter) {
           System.out.print(":)");
           cap++;
       }//end while loop
       System.out.println("");
       counter++;
    }//end while loop

       
       
       
       //step 2 3
//       while (cap<31) {
 //       System.out.print(":)");
   //     cap++;
     //   counter++;
       //}//end while loop
    
    
    
    
    
    
    
//    //Step 1
//    for (counter=0; counter<6; counter++){
//       System.out.print(":)");
//    } //end for loop
//    while (counter < 6) {
//        System.out.print(" :) ");
//        counter++;
//    } //end while loop
    
    
        }//end main mehtod
    
} //end class
    