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
       int min=array1[0];
       int max=array1[0];
       for(a=1; a<50; a++){
           if(min>array1[a]){
               min=array1[a];
           }//end if statement
           if(max<array1[a]){
               max=array1[a];
           }//end if statement
       }//end search for loop
       System.out.println("The maximum of array1 is: "+array1[max]);
       System.out.println("The minimum of array1 is: "+array1[min]);
       
       
       //binary search
        array2[0]=(int) (Math.random()*100);
        for(b=1; b<50; b++){
           array2[b]=((int) (Math.random()*100))+array2[b-1];  
       }//end for loop
       int min=array2[0];
       int max=array2[0];
       for(b=1; b<50; b++){
           if(min>array1[b]){
               min=array1[b];
           }//end if statement
           if(max<array1[b]){
               max=array1[b];
           }//end if statement
       }//end search for loop
       System.out.print("Enter an int: ");
       int find=scan.nextInt;
       int middle=0;
       int max1=49;
       int min1=0;
       while(min1<=max1){              
           middle=(max1+min1)/2;
           if(array2[middle]<find){
               min1=middle+1;
           }//end if statement
           else if(array2[middle]>find){
               max1=middle-1;
           }//end other else if statement
           else if(array2[middle]==find){
                System.out.println(find+" was found in the list."); 
                System.out.println("The number above the key was "+array2[middle+1]);
                System.out.println("The number below the key was: "+array2[middle-1]);
           }//end else if
       }//end while statement
       if(min>max){
           System.out.println(find+" was not found in the list.");
           if(middle=max){
                System.out.println("The number above the key was "+array2[middle+1]);
                System.out.println("The number below the key was: "+array2[middle]);
           }//end if statement
           if(middle=min){
                System.out.println("The number above the key was "+array2[middle]);
                System.out.println("The number below the key was: "+array2[middle-1]);
           }//end if statement
       }//end if statement
       
        
        
        
    }//end main method
    
}//end class