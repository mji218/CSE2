//Michelle Iskandar
//CSE 002
//Make symbols hw06
//3-2-2015

import java.util.Random;

public class MakeSymbols {
    public static void main(String[] args) {  //main method
    
    int rand=(int) (Math.random()*100); //generate random number
    int counter=1;
    
    System.out.println("Random number generated: "+rand);
    
    if(rand%2==0){
      System.out.print("The output pattern: ");
       do {
           System.out.print("*");
           counter++;
       }//end do statment
       while (counter<=rand);
    }//end if statement
       
    else if(rand%2==1){
      System.out.print("The output pattern: ");
        do {
            System.out.print("&");
            counter++;
        } //end second do statement
        while (counter<=rand);
     }//end else if statement
     System.out.println(" ");
        
    }//end main method
    
}//end of class
        