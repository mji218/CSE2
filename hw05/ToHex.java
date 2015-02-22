//Michelle Iskandar
//CSE 002
//To hex hw05
//2-22-15

import java.util.Scanner;
public class ToHex {
    public static void main(String[] args) {  //main method
 
          Scanner scan; //declare scanner
          scan=new Scanner (System.in); 
          
          
          System.out.print("Please enter three numbers representing RGB values: ");
          int red=scan.nextInt(); //recieve red input
          int green=scan.nextInt(); //recieve green input
          int blue=scan.nextInt(); //recieve blue input
          String rHexString1="0";
          String rHexString2="0";
          String gHexString1="0";
          String gHexString2="0";
          String bHexString1="0";
          String bHexString2="0";
          
          
          if (red>255 || green>255 || blue>255){
              System.out.println("Input not in range.");
              return;
          } //end if statement
          else if (red<0 || green<0 || blue<0) {
              System.out.println("Input not in range.");
              return;
          } //end else statement
          
          int rHex1=red/16; //find first value for red
          int rHex2=red%16; //find second value for red
            switch(rHex1){
                case 10:
                     rHexString1="A";
                 break;
                case 11:
                     rHexString1="B";
                 break;
                case 12:
                     rHexString1="C";
                 break;
                case 13:
                     rHexString1="D";
                 break;
                case 14:
                     rHexString1="E";
                 break;
                case 15:
                     rHexString1="F";
                 break;    
                 default:
                 rHexString1 = Integer.toString(rHex1);
            } //end switch statement rHex1
            switch(rHex2){
                case 10:
                     rHexString2="A";
                 break;
                case 11:
                     rHexString2="B";
                 break;
                case 12:
                     rHexString2="C";
                 break;
                case 13:
                     rHexString2="D";
                 break;
                case 14:
                     rHexString2="E";
                 break;
                case 15:
                     rHexString2="F";
                 break;    
                default:
                     rHexString2 = Integer.toString(rHex2);
                     
            } //end switch statement rHex2
            
            
            
            int gHex1=green/16; //find first green value
            int gHex2=green%16; //find second green value
              switch(gHex1){
                case 10:
                     gHexString1="A";
                 break;
                case 11:
                     gHexString1="B";
                 break;
                case 12:
                     gHexString1="C";
                 break;
                case 13:
                     gHexString1="D";
                 break;
                case 14:
                     gHexString1="E";
                 break;
                case 15:
                     gHexString1="F";
                 break;    
                 default:
                 gHexString1 = Integer.toString(gHex1);
            } //end switch statement rHex1
            switch(gHex2){
                case 10:
                     gHexString2="A";
                 break;
                case 11:
                     gHexString2="B";
                 break;
                case 12:
                     gHexString2="C";
                 break;
                case 13:
                     gHexString2="D";
                 break;
                case 14:
                     gHexString2="E";
                 break;
                case 15:
                     gHexString2="F";
                 break;    
                default:
                     gHexString2 = Integer.toString(gHex2);
                     
            } //end switch statement gHex2
            
            
            
            int bHex1=blue/16;
            int bHex2=blue%16;
              switch(bHex1){
                case 10:
                     bHexString1="A";
                 break;
                case 11:
                     bHexString1="B";
                 break;
                case 12:
                     bHexString1="C";
                 break;
                case 13:
                     bHexString1="D";
                 break;
                case 14:
                     bHexString1="E";
                 break;
                case 15:
                     bHexString1="F";
                 break;    
                 default:
                 bHexString1 = Integer.toString(bHex1);
            } //end switch statement rHex1
            switch(bHex2){
                case 10:
                     bHexString2="A";
                 break;
                case 11:
                     bHexString2="B";
                 break;
                case 12:
                     bHexString2="C";
                 break;
                case 13:
                     bHexString2="D";
                 break;
                case 14:
                     bHexString2="E";
                 break;
                case 15:
                     bHexString2="F";
                 break;    
                default:
                     bHexString2 = Integer.toString(bHex2);
            } //end switch statement bHex2
          
          System.out.println("The decimal numbers R:"+red+", G:"+green+", B:"+blue+", is represented in hexadecimal as: "+rHexString1+rHexString2+gHexString1+gHexString2+bHexString1+bHexString2); //print final statement
          
    }//end main method
    
}//end class