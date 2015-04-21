//Michelle Iskandar
//CSE2 lab10 
//4-11-15

import java.util.Scanner;
public class ArrayInputs{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        int size=scan.nextInt;
        int [] array1= new int[size];
        do{
         System.out.print("Please enter 10 positive integers: ");    
         for(int a=0; a<size; a++){
             if(scan.hasNextInt()){
                   array1[a]=scan.nextInt();
                    if(array1[a]<0){
                        System.out.println("You didn't enter a positive integer.");
                    }//end inner if statement
              }//end if statement 
              else{
                 System.out.println("You didn't enter an integer.");
              }//end else statement
          }//end for statement
        }//end do
        while()  //??????????
        
        System.out.println("The array is: ");
        for(int x=0; x<size; x++){
           System.out.println(array1[x]+" ");
        }//end printing for loop
        
    }//end main method
}//end class