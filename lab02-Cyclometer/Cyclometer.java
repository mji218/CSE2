//Michelle Iskandar
//lab02
//CSE2
//January 30 2015
//This program measures the time and number of rotations of the front wheel
//for two trips.  It also prints the distance of each trip and thedistance of the trips 
//combined in miles.


public class Cyclometer{
    //main method for every Java program
    public static void main(String [] args){
	  int secsTrip1=480;  //time for first trip in sec
	  int secsTrip2=3220;  //time for second trip in sec
	  int countsTrip1=1561;  //Revolution of front wheel for first trip
	  int countsTrip2=9037; //Revolution of front wheel for second trip
	  double wheelDiameter=27.0;//diameter front wheel in inches
  	  double PI=3.14159; //define pi
  	    double feetPerMile=5280;  //conversion feet to miles
  	    double inchesPerFoot=12;   //conversion inches to feet
  	    double secondsPerMinute=60;  //conversion seconds to minute
 	  double distanceTrip1, distanceTrip2,totalDistance; //defining each as a double
 
	System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
	System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
	    distanceTrip1=countsTrip1*wheelDiameter*PI; // Distance in inches of trip 1
    	//in each count, a rotation of the wheel travels
    	//diameter in inches times PI
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Conversion distance to miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Distance in miles trip 2
	    totalDistance=distanceTrip1+distanceTrip2; //gives the total distance
	System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	
  }// end main method
  
}//end of class