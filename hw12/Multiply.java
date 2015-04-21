//Michelle Iskandar
//CSE2 hw12
//4-19-15


import java.util.Scanner;
import java.util.Random;
public class Multiply{
    public static int[][] randomMatrix(int width, int height){
        int[][] array = new int[width][];
        for (int i=0; i<width; i++){
            array[i]=new int[height];
            for(int j=0; j<height; j++){
                array[i][j]=(int) ((Math.random()*20)-10);
            }//end height for loop
        }//end width for loop
        return array;
    }//end randomMatrix method
    
    public static void printMatrix(int[][] array1){
        int width=array1.length;
        int height=array1[0].length;
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                System.out.print(array1[i][j]+" ");
            }//end for looop
            System.out.println(" ");
        }//end for loop
    }//end printMatrix method
    
    public static int[][] matrixMultiply(int[][] array1, int[][] array2){
        int width=array1.length;
        int height=array1[0].length;
        int width2=array2.length;
        int height2=array2[0].length;
        int[][] arrayMultiply=new int[width][height2];        
        if(height!=width2){
            System.out.println("Error, these arrays can't be multiplied.");
        }//end if statement
        else{
            for(int a1=0; a1<width; a1++){
                for(int a2=0; a2<height2; a2++){
                    for(int same=0; same<height; same++){
                        arrayMultiply[a1][a2]+=array1[a1][same]*array2[same][a2];
                    }//end other for statement
                }//end for statement
            }//end for statement
            
        }//end else statment
        return arrayMultiply;
    }//end matrixMultiply method
    
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the width and the height of two matrices: ");
        int heightArray=0;
        int widthArray=0;
        int heightArray2=0;
        int widthArray2=0;
        if(scan.hasNextInt()){
            widthArray=scan.nextInt();
                if(widthArray<0){
                    System.out.println("You didn't enter a positive integer.");
                }//end inner if statement
        }//end if statement 
        else{
            System.out.println("You didn't enter an integer.");
        }//end else statement
        if(scan.hasNextInt()){
             heightArray=scan.nextInt();
                if(heightArray<0){
                    System.out.println("You didn't enter a positive integer.");
                }//end inner if statement
        }//end if statement 
        else{
            System.out.println("You didn't enter an integer.");
        }//end else statement
        if(scan.hasNextInt()){
            widthArray2=scan.nextInt();
                if(widthArray2<0){
                    System.out.println("You didn't enter a positive integer.");
                }//end inner if statement
        }//end if statement 
        else{
            System.out.println("You didn't enter an integer.");
        }//end else statement
        if(scan.hasNextInt()){
             heightArray2=scan.nextInt();
                if(heightArray2<0){
                    System.out.println("You didn't enter a positive integer.");
                }//end inner if statement
        }//end if statement 
        else{
            System.out.println("You didn't enter an integer.");
        }//end else statement
        int[][] arrayA=randomMatrix(widthArray, heightArray);
        int[][] arrayB=randomMatrix(widthArray2, heightArray2);
        System.out.println("");
        printMatrix(arrayA);
        System.out.println("");
        printMatrix(arrayB);
        int[][] multiplyArray=matrixMultiply(arrayA, arrayB);
        System.out.println("");
        printMatrix(multiplyArray);
    }//end main method
}//end class    
    