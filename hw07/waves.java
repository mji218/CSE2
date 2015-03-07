//Michelle Iskandar
//CSE 002
//Waves hw07
//2-13-15

import java.util.Scanner;
public class waves {
    public static void main(String[] args) {  //main method
 
          Scanner scan; //declare scanner
          scan=new Scanner (System.in); 
          
          System.out.print("Enter an integer between 1 and 30: "); //prompt user for number
          int userInt;
          int loopCount1;
          int loopCount2;
          int loopCount3;
          
          if(scan.hasNextInt()) {
            userInt=scan.nextInt();  
            if(userInt<1 || userInt>30){
                System.out.println("Invalid input");
                return;
            } //end if not between 1-30
       
            else{                          //start else (between 1 and 30)
            System.out.println("");        //print line after prompt and enter
            
   //start of for loop program
            System.out.println("For Loop:");
                for(loopCount1=1; loopCount1<=userInt; loopCount1++){
                    if(loopCount1%2==0){ 
                        for(loopCount2=1; loopCount2<=loopCount1; loopCount2++){
                            for(loopCount3=1; loopCount3<=loopCount2; loopCount3++){
                                System.out.print(loopCount1);
                            }// end third for loop
                            System.out.println("");
                        }//end second for loop
                        
                    }//end if even statement
                    else{
                        for(loopCount2=loopCount1; loopCount2>=1; loopCount2--){
                            for(loopCount3=1; loopCount3<=loopCount2; loopCount3++){
                                System.out.print(loopCount1);
                            }// end third for loop
                            System.out.println("");
                        }//end second for loop
                    }//end else (if odd)
                }//end of first for loop
                System.out.println("");
                
    //end of for loop program
    
    //start of while loop program
            System.out.println("While Loop:");
                loopCount1=1;
                while (loopCount1<=userInt){ 
                    if(loopCount1%2==0){
                        loopCount2=1;
                        while(loopCount2<=loopCount1) {
                            loopCount3=1;
                            while(loopCount3<=loopCount2){ 
                                System.out.print(loopCount1);
                                loopCount3++;
                            }// end third while loop
                            System.out.println("");
                            loopCount2++;
                        }//end second while loop
                        
                    }//end if even statement
                    else{
                        loopCount2=loopCount1;
                        while(loopCount2>=1){
                            loopCount3=1;
                            while(loopCount3<=loopCount2){
                                System.out.print(loopCount1);
                                loopCount3++;
                            }// end third while loop
                            System.out.println("");
                            loopCount2--;
                        }//end second while loop
                    }//end else (if odd)
                    loopCount1++;
                }//end of first while loop
                System.out.println("");
      //end while loop program
      
      //start do while program
            System.out.println("Do-While Loop:");
                loopCount1=1;
                do{ 
                    if(loopCount1%2==0){
                        loopCount2=1;
                        do{
                            loopCount3=1;
                            do{ 
                                System.out.print(loopCount1);
                                loopCount3++;
                            }// end third dowhile loop
                            while(loopCount3<=loopCount2);
                            System.out.println("");
                            loopCount2++;
                        }//end second dowhile loop
                        while(loopCount2<=loopCount1); 
                        
                    }//end if even statement
                    else{
                        loopCount2=loopCount1;
                        do{
                            loopCount3=1;
                            do{
                                System.out.print(loopCount1);
                                loopCount3++;
                            }// end third dowhile loop
                            while(loopCount3<=loopCount2);
                            System.out.println("");
                            loopCount2--;
                        }//end second dowhile loop
                        while(loopCount2>=1);
                    }//end else (if odd)
                    loopCount1++;
                }//end of first dowhile loop
                while (loopCount1<=userInt);
   //end dowhile program
                
            }//end nested else statement
              
          } //end if statment
          
          else {
              System.out.println("Invalid input");
          }//end else statement
      
    }//end main method
    
}//end class