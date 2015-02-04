//Michelle Iskandar
//CSE 002 hw02
//January 31 2015
//This program computes the cost of items bought plus a 6% sales tax.

public class Arithmetic{
    //main method
    public static void main(String [] args) {
        //set variables and prices and tax
        int nSocks=3; //number of socks
        double sockCost$=2.58; //cost per pair of socks
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //price per drinking glass
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of evelopes
        double taxPercent=0.06; //sales tax multiply
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; //define as double
        double sTax1$, gTax1$, eTax1$; //define tax totals as doubles
        double tCost1$; // define total cost of purchases as double
        double actualPaid1$; //define what was actually paid for transaction as double
        double totalTax1$; //define the sales tax of everything
        
        //calculations, total cost of each
        totalSockCost$=sockCost$*nSocks; //total cost of socks
        totalGlassCost$=glassCost$*nGlasses; //total cost of glasses
        totalEnvelopeCost$=envelopeCost$*nEnvelopes; //total cost of enverlopes
        
        //calculations, sales tax on each
    
        sTax1$=totalSockCost$*taxPercent; //sales tax on socks
        double sTax2$= sTax1$*100;
        int sockTaxInt$= (int) sTax2$; //make into two decimal place number
        double sockTax1$=(double) sockTaxInt$;
        double sockTax2$=sockTax1$/100; 
        
        gTax1$=totalGlassCost$*taxPercent; //sales tax on glasses
        double gTax2$=gTax1$*100;
        int glassTaxInt$= (int) gTax2$; //make into two decimal place number
        double glassTax1$=(double) glassTaxInt$;
        double glassTax2$=glassTax1$/100;
        
        eTax1$=totalEnvelopeCost$*taxPercent; //sales tax on envelopes
        double eTax2$=eTax1$*100;
        int envelopeTaxInt$=(int) eTax2$; //make into two decimal place number
        double envelopeTax1$=(double) envelopeTaxInt$;
        double envelopeTax2$=envelopeTax1$/100;
        
        //calculation, total cost of purchases wihtout tax
        tCost1$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //cost of all the items together
        double tCost2$=tCost1$*100;
        int totalCostInt$= (int) tCost2$; //turn into two decimal place number
        double totalCost1$=(double) totalCostInt$;
        double totalCost2$=totalCost1$/100;
        
        //sales tax total
        totalTax1$=totalCost2$*taxPercent; //the sales tax on all items
        double tTax1$=totalTax1$*100;
        int totalTaxInt$= (int) tTax1$;  //turn into two decimal place
        double totalTax2$= (double) totalTaxInt$;
        double totalTax$=totalTax2$/100;
        
        //calculation, totally actually paid for transaction
        actualPaid1$=totalCost2$+(totalCost2$*taxPercent); //the cost with sales tax
        double aPaid1$=actualPaid1$*100; //turn into two decimal number
        int actualPaidInt$=(int) aPaid1$;
        double actualPaid2$=(double) actualPaidInt$;
        double actualPaid$=actualPaid2$/100;
        
        //print statements
        
        System.out.println("Number of socks bought was: "+nSocks); //print the numer of socks bought
        System.out.println("Number of glasses bought was: "+nGlasses); //print the number of glasses bought
        System.out.println("Number of boxes of envelopes bought was: "+nEnvelopes); //print the number of envelopes bought
        System.out.println("Price of socks was: $"+sockCost$); //print the proce of socks
        System.out.println("Price of glasses was: $"+glassCost$); //print the price of glasses
        System.out.println("Price of envelopes was: $"+envelopeCost$); //print the price of envelopes
        System.out.println("Tax on socks was: $"+sockTax2$); //print the tax on socks
        System.out.println("Tax on glasses was: $"+glassTax2$); //print the tax on glasses
        System.out.println("Tax on envelopes was: $"+envelopeTax2$); //priint the tax on envelopes
        System.out.println("Cost of Socks was: $"+totalSockCost$); //print the cost of socks
        System.out.println("Cost of Glasses was: $"+totalGlassCost$); //print the cost of glasses
        System.out.println("Cost of Envelopes was: $"+totalEnvelopeCost$); //print the cost of envelope
        System.out.println("The cost of all the items without tax was: $"+totalCost2$); //print the total cost without tax
        System.out.println("The sales tax on all items was: $"+totalTax$); //print the total sales tax
        System.out.println("The total amount actually paid was: $"+actualPaid$); //print the cost that was actually paid
        
       
       } 
        
    }