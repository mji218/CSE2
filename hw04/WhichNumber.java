//Michelle Iskandar
//HW4 program 1
//CSE 002
//02/11/15

import java.util.Scanner; //import a scanner
  public class WhichNumber {   
      public static void main(String[] args) {  //main method
          
          System.out.println("Think of a number between 1 and 10 inclusive"); //prompt user to think of a number
          
          Scanner myScanner; //declare scanner
          myScanner=new Scanner (System.in); //create instance that will take input
          
          System.out.print("Is the number even? "); 
          String evenNumber=myScanner.next(); //accepts user input


          if ((evenNumber.equals("y")) || (evenNumber.equals("Y"))) {  //if the number is even then...
              System.out.print("Is it divisible by 3? ");  //possible even number route 
              String div3Number=myScanner.next(); //accept user input
               if ((div3Number.equals("y")) || (div3Number.equals("Y"))) { //if the number is divisible by 3
                   System.out.print("Is your number 6? "); //route if number is divisible by 3
                   String guessSix=myScanner.next(); //accept user input
                    if ((guessSix.equals("y")) || (guessSix.equals("Y"))) {
                      System.out.println("YAY!");
                      } //end number 6 if statement
                    else if ((guessSix.equals("n")) || (guessSix.equals("N"))) {
                        System.out.println("BOO!");
                    } //end if not number 6 
                    else {
                     System.out.println("Sorry, not valid input");
                    }
                
               } //end yes div 3 if statement
                
                
                else if ((div3Number.equals("n")) || (div3Number.equals("N"))) { //this means number is not divisible by 3
                   System.out.print("Is number divisible by 4? "); 
                   String div4Number=myScanner.next(); 
                    if ((div4Number.equals("y")) || (div4Number.equals("Y"))) {
                        System.out.print("Is the number divided by 4 greater than 1? "); //route if number is divisible by 4
                        String greaterThan1=myScanner.next();
                         if ((greaterThan1.equals("y")) || (greaterThan1.equals("Y"))) {
                             System.out.print("Is your number 8? "); //route if number when divided by 4 is greater than 1
                             String guessEight=myScanner.next();
                              if ((guessEight.equals("y")) || (guessEight.equals("Y"))) {
                                  System.out.println("YAY!");
                              } // end if number is eight
                              else if ((guessEight.equals("n")) || (guessEight.equals("N"))) {
                                   System.out.println("BOO!");
                              } //end if not number 8  
                                else {
                                 System.out.println("Sorry, not valid input");
                                }  
                         } // end greater than 1 statement
                         else if ((greaterThan1.equals("n")) || (greaterThan1.equals("N"))) { //route if number when divided by for doesnt equal 1
                            System.out.print("Is the number 4? ");
                            String guessFour=myScanner.next();
                             if ((guessFour.equals("y")) || (guessFour.equals("Y"))) {
                                 System.out.println("YAY!");
                             } //end if number is 4
                             else if ((guessFour.equals("n")) || (guessFour.equals("N"))) {
                                 System.out.println("BOO!");
                             } //end if not 4
                             else {
                                 System.out.println("Sorry, not valid input");
                                }
                         } //end when divided by 4 doesnt equal 1
                    } //end div by 4 statement
                    
                    else if ((div4Number.equals("n")) || (div4Number.equals("N"))) { //if number is not divisible by 4
                       System.out.print("Is number divisible by 5? "); //route if number is not divisible by 4
                       String div5Number=myScanner.next(); //accept user input
                        if ((div5Number.equals("y")) || (div5Number.equals("Y"))) {
                          System.out.print("Is your number 10? "); //route if number divisible by 5
                          String guessTen=myScanner.next(); //accept user input
                           if ((guessTen.equals("y")) || (guessTen.equals("Y"))) {
                              System.out.println("YAY!");
                           } //end if number is ten
                           else if ((guessTen.equals("n")) || (guessTen.equals("N"))) {  
                             System.out.println("BOO!");
                           } //end not 10 statement
                            else {
                               System.out.println("Sorry, not valid input");
                             }
                           
                        } //end of div 5 statement
                        
                        else if ((div5Number.equals("n")) || (div5Number.equals("N"))) { //this means number is not divisible by 5 
                          System.out.print("Is your number 2? ");
                          String guessTwo=myScanner.next(); 
                           if ((guessTwo.equals("y")) || (guessTwo.equals("Y"))) {
                               System.out.println("YAY!");   
                           } //end if two statement
                           else if ((guessTwo.equals("n")) || (guessTwo.equals("N"))) {
                               System.out.println("BOO!");
                           } //end not 2 statement
                           else {
                               System.out.println("Sorry, not valid input");
                             }
                     
                        } //end not div 5 statement
                   
                 
                    } //end not div by 4 statement
                    else {
                   System.out.println("Sorry, not valid input");
                }
                    
                } //end not div by 3
                else {
                   System.out.println("Sorry, not valid input");
                }
                   
         } // end yes even
         
         else if ((evenNumber.equals("n")) || (evenNumber.equals("N"))) { //route if number is not even
            System.out.print("Is it divisible by 3? ");  
            String div3Number2=myScanner.next(); //accept user input
             if ((div3Number2.equals("y")) || (div3Number2.equals("Y"))) { //route if number is divisible by 3
                 System.out.print("When divided by 3 is the result greater than 1? ");
                 String greaterThan1a=myScanner.next();
                  if ((greaterThan1a.equals("y")) || (greaterThan1a.equals("Y"))) { //route if divided by 3 greater than 1
                     System.out.print("Is your number 9? ");
                     String guessNine=myScanner.next(); 
                      if ((guessNine.equals("y")) || (guessNine.equals("Y"))) {
                          System.out.println("YAY!");   
                      } //end if 9 statement
                      else if ((guessNine.equals("n")) || (guessNine.equals("N"))) {
                          System.out.println("BOO!");
                      }//end of not 9 statement 
                      else {
                        System.out.println("Sorry, not valid input");
                      }
                      
                  } //end if div 3 greater than 1
                      
                   else if  ((greaterThan1a.equals("n")) || (greaterThan1a.equals("N"))) {  //if number when divided by three is not greater 1
                     System.out.print("Is your number 3? ");
                     String guessThree=myScanner.next();
                       if ((guessThree.equals("y")) || (guessThree.equals("Y"))) {
                          System.out.println("YAY!");   
                      } //end if 3 statement
                      else if ((guessThree.equals("n")) || (guessThree.equals("N"))) {
                          System.out.println("BOO!");
                      }//end of not 3 statement 
                      else {
                        System.out.println("Sorry, not valid input");
                      }
                      
                  }// end of not greater than 1 odd statement
         
                     
             } // end of div 3 and odd statement
             
             else if ((div3Number2.equals("n")) || (div3Number2.equals("N"))) { //route if number isn't divisible by 3
                System.out.print("Is your number greater than 6? ");
                String greaterThan6=myScanner.next();
                 if ((greaterThan6.equals("y")) || (greaterThan6.equals( "Y"))) {
                    System.out.print("Is your number 7? ");
                    String guessSeven=myScanner.next(); 
                    if ((guessSeven.equals("y")) || (guessSeven.equals("Y"))) {
                       System.out.println("YAY!");   
                    } //end if 7 statement
                    else if ((guessSeven.equals("y")) || (guessSeven.equals("Y"))) {
                       System.out.println("BOO!");
                      }//end of not 7 statement
                      else {
                        System.out.println("Sorry, not valid input");
                      }
                      
                 }//end of greater than six
                 else if ((greaterThan6.equals("n")) || (greaterThan6.equals("N"))) { //route if not greater than 6, less than 3
                    System.out.print("Is your number less than 3? ");
                    String lessThan3=myScanner.next();
                     if ((lessThan3.equals("y")) || (lessThan3.equals("Y"))) {
                        System.out.print("Is your number 1? ");
                        String guessOne=myScanner.next(); 
                         if ((guessOne.equals("y")) || (guessOne.equals("Y"))) {
                            System.out.println("YAY!");   
                         } //end if 1 statement
                         else if ((guessOne.equals("n")) || (guessOne.equals("N"))) {
                            System.out.println("BOO!");
                         }//end of not 1 statement
                         else {
                            System.out.println("Sorry, not valid input");
                          }
                        
                     }// end of less than 3
                     else if ((lessThan3.equals("n")) || (lessThan3.equals("N"))) { //route if not less than 3
                     System.out.print("Is your number 5? ");
                        String guessFive=myScanner.next(); 
                         if ((guessFive.equals("y")) || (guessFive.equals("Y"))) {
                            System.out.println("YAY!");   
                         } //end if 5 statement
                         else if ((guessFive.equals("n")) || (guessFive.equals("N"))) {
                            System.out.println("BOO!");
                         } //end of not 5 statement
                         else {
                            System.out.println("Sorry, not valid input");
                         }
                         
                     }// end of not less than 3
                      else {
                         System.out.println("Sorry, not valid input");
                      }
                     
                 } //end of not greater than 6 less than 3
                 else {
                    System.out.println("Sorry, not valid input");
                 }
                 
             } // end of not divisible by 3 statement
             else {
                 System.out.println("Sorry, not valid input");
             }
                  
          } //end of else even statement
          else {
                   System.out.println("Sorry, not valid input");
                }
          
          
    } //end main method
 } //end class