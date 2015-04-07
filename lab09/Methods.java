//Michelle ISkandar
//CSE 002 lab09
//3-27-15

import java.util.Random;
public class Methods{
    public static String adjective(){
        int rand= (int) (Math.random()*9);
        String returnValue="";
        switch(rand){
            case 0: returnValue = "forgetful";
                break;
            case 1: returnValue = "short";
                break;
            case 2: returnValue = "happy";
                break;
            case 3: returnValue = "sad";
                break;
            case 4: returnValue = "silly";
                break;
            case 5: returnValue = "bad";
                break;
            case 6: returnValue = "bright";
                break;
            case 7: returnValue = "brave";
                break;
            case 8: returnValue = "moody";
                break;
            case 9: returnValue = "sly";
                break;
        }//end switch statement
        return returnValue;
    }//end adjective method
    
    public static String subject(){
        int rand= (int) (Math.random()*9);
        String returnValue="";
        switch(rand){
        case 0: returnValue = "light";
                break;
            case 1: returnValue = "puppy";
                break;
            case 2: returnValue = "guy";
                break;
            case 3: returnValue = "lady";
                break;
            case 4: returnValue = "wizard";
                break;
            case 5: returnValue = "robot";
                break;
            case 6: returnValue = "tree";
                break;
            case 7: returnValue = "moose";
                break;
            case 8: returnValue = "cactus";
                break;
            case 9: returnValue = "phone";
                break;
        }//end switch statement
        return returnValue;    
    } //end subject method
    
        public static String verb(){
        int rand= (int) (Math.random()*9);
        String returnValue="";
        switch(rand){
        case 0: returnValue = "ran";
                break;
            case 1: returnValue = "jumped";
                break;
            case 2: returnValue = "attacked";
                break;
            case 3: returnValue = "usurped";
                break;
            case 4: returnValue = "walked";
                break;
            case 5: returnValue = "danced with";
                break;
            case 6: returnValue = "leaped";
                break;
            case 7: returnValue = "bounded";
                break;
            case 8: returnValue = "gathered";
                break;
            case 9: returnValue = "passed";
                break;
        }//end switch statement
        return returnValue;    
    } //end subject method
    
    
    public static String object(){
        int rand= (int) (Math.random()*9);
        String returnValue="";
        switch(rand){
        case 0: returnValue = "light";
                break;
            case 1: returnValue = "puppy";
                break;
            case 2: returnValue = "guy";
                break;
            case 3: returnValue = "lady";
                break;
            case 4: returnValue = "wizard";
                break;
            case 5: returnValue = "robot";
                break;
            case 6: returnValue = "tree";
                break;
            case 7: returnValue = "moose";
                break;
            case 8: returnValue = "cactus";
                break;
            case 9: returnValue = "phone";
                break;
        }//end switch statement
        return returnValue;    
    } //end subject method
    
    public static void main(String [] args){
        System.out.println("The "+adjective()+" "+adjective()+" "+subject()+" "+verb()+" the "+adjective()+" "+object()+".");
    }//end main method
    
    
}//end class