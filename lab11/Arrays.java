//Michelle Isjandar
//CSE2 lab11
//4-10-15

import java.util.Scanner;
import java.util.Random;
public class Arrays{
    public static void main(String[] args){
       int [] array1= new int[50];
       int [] array2= new int[50];
       int a,b;
       boolean found;
       Scanner scan=new Scanner(system.in);
      
       //linear search
       for(a=0; a<50; a++){
           array1[a]=(int) (Math.random()*100);
       }//end for loop
       for(a=0; a<50; a++){
           if(array1[a-1]<array1[a]){
               found=true;
           }//end if statement
       }//end search for loop
       
       
       //binary search
        for(b=0; b<50; b++){
           array2[b]=(int) (Math.random()*100);
       }//end for loop
       /////////////FIND MAX AND MIN
       int find=scan.nextInt;
       int middle=(max+min)/2;
       while(min<=max){
           if(array2[middle]<find){
               min=middle+1;
           }//end if statement
           else if(array2[middle]==find){
               System.out.println(find+" was found!");
           }//end else if
           else{
               max=middle-1;
               middle=(max+min)/2;
           }//end else
       }//end while statement
       
        
        
        
    }//end main method
    
}//end class