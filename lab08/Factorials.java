//Michelle Iskandar
//CSE 002
//lab08 Factorials
//3-19-15

import java.util.Scanner;
public class Factorials {
    public static int factorial(int input) {
        int x=1;
        int i;
        for(i=1; i<=input; i++){
                 x*=i;
        }//end big for loop
        return x;
    }//end factorial method
    
    public static void print(int input, int sum) {
         System.out.println("The super factorial of "+input+" is "+sum);
    }//end print method
    
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner scan=new Scanner (System.in);
        int input=scan.nextInt();
        int result=0;
        int j;
        for(j=1; j<=input; j++) {
         result+=factorial(j);
        }//end addition for loop
        print(input, result);
    
    }// end main method
} // end class