//Michelle Iskandar
//CSE2 hw11
//4-13-15


import java.util.Scanner;
import java.util.Random;
public class CSE2Linear{
    public static void main(String [] args){
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        Scanner scan=new Scanner(System.in);
        int [] grades= new int[15];
        for(int a=0; a<15; a++){
            if(scan.hasNextInt()){
                grades[a]=scan.nextInt();
                if(grades[a]<0||grades[a]>100){
                    System.out.println("Int not between 0 and 100!");
                    System.exit(0);
                }//end inner if statement
                else if(a!=0){
                    if(grades[a]<grades[a-1]){
                    System.out.println("Int must be greater than previous int!");
                    System.exit(0);
                    }//end nested if statement
                }//end inner else if statement
            }//end if statement 
            else{
                System.out.println("Error, not an int!");
                System.exit(0);
            }//end else statement
       }//end for loop
       System.out.println("The grades sorted are: ");
       for(int x=0; x<15; x++){
           System.out.print(grades[x]+" ");
       }//end pritning for loop
       System.out.println("");
       System.out.print("Enter a grade to search for: ");
       int search=0;
       if(scan.hasNextInt()){
            search=scan.nextInt(); 
       }//end check for int
       else{
           System.out.println("Number not an int!");
           System.exit(0);
       }//end else statmenet
       binary(search,grades);
       System.out.println("Scrambled:");
       eggs(grades);
       for(int x=0; x<15; x++){
           System.out.print(grades[x]+" ");
       }//end pritning for loop
       System.out.println("");
       System.out.print("Enter a grade to search for: ");
       int search2=0;
       if(scan.hasNextInt()){
            search2=scan.nextInt(); 
       }//end check for int
       else{
           System.out.println("Number not an int!");
           System.exit(0);
       }//end else statmenet
       linear(search2,grades);
    }//end main method
    
    
    public static void binary(int y, int[] array2){
       int min=0;
       int max=14;
       int iteration=0;
       int middle;
       while(min<=max){              //&&(middle!=y)
           iteration++;
           middle=(max+min)/2;
           if(array2[middle]<y){
               min=middle+1;
           }//end if statement
           else if(array2[middle]>y){
               max=middle-1;
           }//end other else if statement
           else if(array2[middle]==y){
                System.out.println(y+" was found in the list with "+iteration+" iterations"); 
                break;
           }//end else if
           
       }//end while statement
       if(min>max){
           System.out.println(y+" was not found in the list with "+iteration+" iterations.");
       }//end if statement
    }//end binary search mthod
    
    
    public static void linear(int x, int[] array){
        int iterations=0;
        int a=0;
        for(a=0; a<=14; a++){  
            iterations++;
            if(array[a]==x){
                System.out.println(x+" was found in the list with "+iterations+" iterations.");
                break;
            }//end if statment
        }//end for statment
        if(a==15){
                System.out.println(x+" was not found in the list with "+iterations+" iterations.");
            }//end else if statement
    }//end linear search method
    
    public static void eggs(int[] array3){
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        while(a<15){
            b=(int)(Math.random()*15);
            c=(int)(Math.random()*15);
            d=array3[b];
            array3[b]=array3[c];
            array3[c]=d;
            a++;
        }//end while loop
    }//end scramble method
    
}//end class