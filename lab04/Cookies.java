//Michelle Iskandar
//CSE 002
//Cookies lab 4
//2-13-15

import java.util.Scanner;
public class Cookies {
    public static void main(String[] args) {  //main method
 
          Scanner myScanner; //declare scanner
          myScanner=new Scanner (System.in); 
          
          System.out.print("Enter the number of people: "); //prompt user for number of people
          int nPeople;
          
          if(myScanner.hasNextInt()) { //if user input is an int...
            nPeople=myScanner.nextInt(); 
            if(nPeople<1){
              System.out.println("You did not enter an int > 0");
              return; 
            }//end if npeople less than 1
          } //end if user input int
          
          else { //else no people
            System.out.println("You did not enter an int");
            return; //leaves program
                       //program terminates
          } //end else no people
          
         
          System.out.print("Enter the number of cookies you are planning to buy: ");
          int nCookies; //check if user input cookies is true
          
          if(myScanner.hasNextInt()) {
            nCookies=myScanner.nextInt();
            if(nCookies<1){
              System.out.println("You did not enter an int > 0");
              return; 
            }//end if cookies less than 1
          } //end if user input cookies true
          
          else { //else no cookies
            System.out.println("You did not enter an int");
            return; //leaves program
                       //program terminates
          } //end else no cookies
          
          System.out.print("How many do you want each person to get: ");
          int cookiesPer;
          
          if(myScanner.hasNextInt()) {
            cookiesPer=myScanner.nextInt(); //check if user input per person is true
            if (cookiesPer<0) {
              System.out.println("You did not enter an int > 0");
              return; 
            }//end if cookiesper less than 0
          } //end if user input per person is int
          
          else { //else no cper person
            System.out.println("You did not enter an int");
            return; //leaves program
                       //program terminates
          } //end else no per person
          
          //math
          
          if(nCookies < cookiesPer*nPeople) {
            int moreCookies=0;
            moreCookies= cookiesPer*nPeople-nCookies;
            System.out.println("You do not have enough cookies.  You need "+moreCookies+" more cookies." );
          }
          
          else if(nCookies%nPeople == 0) { //divide evenly
             System.out.println("You have enough cookies for each person, and they will divide evenly."); 
          } //end if divide evenly
           
          else{ //DETERMINE ODD 
            System.out.println("You have enough, but they will not divide evenly.");
          }//end else odd statement
    
    
    } //end main method
    
} //end class