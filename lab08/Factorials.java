//Michelle Iskandar
//CSE 002
//lab08 Factorials
//3-19-15

//import java.util.Scanner;
public class Factorials {
    //public static void main(String[] args){
    //public static int factorial(int input) {
       /* int x=1;
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
        print(input, result); */
        
        public static int perplex(int x,int y){
	x+=3;
	y+=x;
	if(y>x+2){ return x; }
	return x+y;
}

public static void main( String args[] ){
	int x=-4,z=7;
	int y=perplex(z,x);
	System.out.println(y+" "+x);		//(a)
	x=10;
	y=perplex(x,x);
	System.out.println(y+ " " + x);	//(b)
     System.out.println( perplex(5, 1+perplex(6,7)));	//(c)
//}
    
    }// end main method
} // end class