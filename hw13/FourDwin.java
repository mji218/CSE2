//Michelle Isjandar
//CSE2 hw13
//4-26-15

import java.util.Scanner;
import java.util.Random;
public class FourDwin {
    public static void statArray(double [][][][] fourD){
        int numMembers=0;
        double sum=0.0;
        double mean=0.0;
        for(int a=0; a<3; a++){
            for(int b=0; b<fourD[a].length; b++){
                for(int c=0; c<fourD[a][b].length; c++){
                    for(int d=0; d<fourD[a][b][c].length; d++){
                    sum+=fourD[a][b][c][d];
                    numMembers++;
                    }//end filling for loop
                }//end inner inner for loop
            }//end inner for loop
        }//end for loop
        mean=(int) (sum/numMembers);
        System.out.println("The number of members is: "+numMembers);
        System.out.println("The sum is: "+sum);
        System.out.println("The mean is: "+mean);
    }//end stat method
    
    public static double[][][][] sort4DArray(double[][][][] fourD){
        for(int a=1; a<3; a++){
            if (fourD[a].length<fourD[a-1].length){
                double key[][][]=new double[fourD[a].length][][];
                key=fourD[a];
                fourD[a]=fourD[a-1];
                fourD[a-1]=key;
            }//end if statement to sort
            else if(fourD[a].length==fourD[a-1].length){
                double minimum=32;
                double minimumb4=32;
                for(int x=0; x<3; x++){
                    for(int b=0; b<fourD[x].length; b++){
                        for(int c=0; c<fourD[x][b].length; c++){
                            for(int d=0; d<fourD[x][b][c].length; d++){
                            minimum=fourD[x][b][c][d];    
                            }//end filling for loop
                        }//end inner inner for loop
                    }//end inner for loop
                }//end for loop

            //sort for 3D of the same size
                for(int x=1; x<3; x++){
                    for(int b=0; b<fourD[x-1].length; b++){
                        for(int c=0; c<fourD[x-1][b].length; c++){
                            for(int d=0; d<fourD[x-1][b][c].length; d++){
                            minimum=fourD[x-1][b][c][d];    
                            }//end filling for loop
                        }//end inner inner for loop
                     }//end inner for loop
                }//end for loop
                    
                    if(minimumb4>minimum){
                        double hold[][][]=new double[fourD[a].length][][];
                        hold=fourD[a];
                        fourD[a]=fourD[a-1];
                        fourD[a-1]=hold;
                    }//end if statement to swap
            }//end else if statement to find if sort 3D
        }//end for loop
        return fourD;
    }//end sort method
    
    
 /*   public static double [][][] sort3DArray(double[][][] threeD){
        
    }//end 3d sort method
    */
    
    public static void printArray(double[][][][] fourD){
        System.out.print("{");
        for(int a=0; a<3; a++){
            System.out.print("{");
            for(int b=0; b<fourD[a].length; b++){
                System.out.print("{");
                for(int c=0; c<fourD[a][b].length; c++){
                    System.out.print("{");
                    for(int d=0; d<fourD[a][b][c].length; d++){
                    System.out.print(fourD[a][b][c][d]+", "); 
                    }//end filling for loop
                    System.out.print("}");
                }//end inner inner for loop
                System.out.print("}");
            }//end inner for loop
            System.out.print("}");
        }//end for loop
        System.out.println("}");
        
    }//end print method
    
    public static void main(String[] args){
        int x=0;
        int y=0;
        int treeD;
        int twoD;
        int oneD;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter an integer X: ");
        if(scan.hasNextInt()){
            x=scan.nextInt();
                if(x<0){
                    System.out.println("You didn't enter a positive integer.");
                }//end inner if statement
        }//end if statement 
        else{
            System.out.println("You didn't enter an integer.");
        }//end else statement
        int i=0;
        while(i<1){
            System.out.print("Enter an integer Y where Y > X: ");
            if(scan.hasNextInt()){
            y=scan.nextInt();
            i++;
                if(y<0){
                    System.out.println("You didn't enter a positive integer.");
                    i--;
                }//end inner if statement
                else if(y<x){
                    System.out.println("Integer not valid");
                    i--;
                }//end if else statement
            }//end if statement 
            else{
                System.out.println("You didn't enter an integer.");
            }//end else statement
        }//end while loop
        
        double[][][][] fourD=new double[3][][][];
       
        for(int h=0; h<3; h++){
            treeD=(int)(Math.random()*(y-x+1)+x);
            fourD[h]=new double[treeD][][];
            for(int j=0; j<treeD; j++){
                twoD=(int)(Math.random()*(y-x+1)+x);
                fourD[h][j]=new double[twoD][];
                for(int k=0; k<twoD; k++){
                    oneD=(int)(Math.random()*(y-x+1)+x);
                    fourD[h][j][k]=new double[oneD];
                }//end inner inner for loop
            }//end inner for loop
        }//end for loop
        
        for(int a=0; a<3; a++){
            for(int b=0; b<fourD[a].length; b++){
                for(int c=0; c<fourD[a][b].length; c++){
                    for(int d=0; d<fourD[a][b][c].length; d++){
                    fourD[a][b][c][d]=(double)((int)(Math.random()*300))/10;    
                    }//end filling for loop
                }//end inner inner for loop
            }//end inner for loop
        }//end for loop
        
        System.out.println("Original Array: ");
        printArray(fourD);
        statArray(fourD);
        System.out.println("Sorted Array: ");
       // printArray(sort4DArray(fourD));   I tried but my swapping of the arrays was not working...
        
    }//end main method
    
}//end class    