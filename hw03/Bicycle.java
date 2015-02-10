//Michelle Iskandar
//HW3 program 1
//CSE 002
//02/05/15

import java.util.Scanner; //import a scanner
  public class Bicycle {   
      public static void main(String[] args) {  //main method
          
          Scanner myScanner; //declare scanner
          myScanner=new Scanner (System.in); //create instance that will take input
          
          System.out.print("Enter the number of counts: "); //prompt user for counts
          double nCounts=myScanner.nextDouble(); //accept user input
          System.out.print("Enter the number of seconds during which the counts occured: "); //prompt user for seconds
          double nSeconds=myScanner.nextDouble(); //accept user input
          
          double wheelDiameter=27.0; //diameter of the wheel in inches
          double inchPerFt=12; //gives conversion in. to ft
          double ftPerMile=5280; //gives conversion ft to miles
          double pi=3.14159; //gives pi, needed for conversion
          double distanceTotal1=nCounts*wheelDiameter*pi*100; //calculates total distance in inches
          int avgMilesInt= (int) (distanceTotal1/inchPerFt/ftPerMile); //gives distance in miles
          double avgMiles= (double) avgMilesInt;
          double avgMiles2=avgMiles/100;
          double secondsPerMin=60; //conversion seconds to minutes
          double minPerHour=60; //conversion minutes to hours
          double tTimeMin=nSeconds/secondsPerMin; //gives time in minutes
          double tTimeHour=nSeconds/secondsPerMin/minPerHour*100; //gives hours
          int avgHoursInt= (int) tTimeHour; 
          double avgHours=(double) avgHoursInt;
          double avgHours2=avgHours/100;
          double avgMPH1=avgMiles/tTimeHour; //calculates average miles per hour
          
          
          System.out.println("The total distance travelled was: "+avgMiles2+" miles and took "+tTimeMin+" minutes"); //print distance in miles
          System.out.println("The average miles per hour was: "+avgMPH1+" mph"); //gives avg miles per hour
          
      } //end main method
      
  } //end class