//Michelle Iskandar
//CSE 002 
//hw08 HW8 Game program
//3-20-15

import java.util.Scanner;
import java.util.Random;
public class HW8 {
     public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//end giant method
    
     public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//end cave method
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }//end box method

//not sure if this is correct
    public static String getInput(Scanner scan, String string){
        String userInput=scan.next();
        if(userInput.equals("C")||userInput.equals("c")){

        }//end if statement
        else{
            System.out.println("Yea right LOSER!");
            System.exit(0); 
        }//end else statement
        return userInput;
    }//end getInput method
  
  //not sure if this is correct  
    public static String getInput(Scanner scan, String string, int trial){
        String userInput="";
        int counter=0;
        while (counter<trial){
            userInput=scan.next();
            if(userInput.equals("A")||userInput.equals("a")){
                int rand= (int) (Math.random()*10);
                if(rand>=5){
                    System.out.println("Critical Hit!!");
                    counter++;
                }//end hit statement
                else if(rand<5){
                    System.out.println("Missed him!");
                }//end miss statment
            }//end attack if statement
            else if(userInput.equals("E")||userInput.equals("e")){
                int rand2=1+(int) (Math.random()*10);
                if(rand2==10){
                    System.out.println("You have escaped successfully!");
                    System.exit(0);
                }//end if escape statement
            }//end escape if statement
            else{
                System.out.println("Executed by the GIANT? Game Over!");
                System.exit(0);  
            }//end else statement
            if(counter<trial){
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }//end if counter statement
        }//end while loop
        return userInput;
    }//end get input with trial method
    
    public static String getInput(Scanner scan){
        int userInput=scan.nextInt();
        switch (userInput) {
            case 1: 
                System.out.println("You're a genius, skip ahead to graduation");
                break;
            case 2:
                System.out.println("Free trip to Aruba");
                break;
            case 3:
                System.out.println("Pocket Dictionary");
                break;
            default:
                System.out.println("A wrong number? You get nothing! Better start over!");
        }//end switch statement
        return (""+userInput);
    }//end get input with just scanner method
    
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//end main mehthod
    
    
    
    
    
    
    
    
}//end class