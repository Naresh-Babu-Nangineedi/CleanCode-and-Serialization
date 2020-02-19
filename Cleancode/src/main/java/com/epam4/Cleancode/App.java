package com.epam4.Cleancode;

import java.util.*;
import java.io.*;
public class App
{
    public static void main( String[] args ){
    	Scanner sc = new Scanner(System.in);
		PrintStream p =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        p.println("Select any Option:\n1.Interest Calculation\n2.House Construction Cost");
        int input=sc.nextInt();
  
        if(input==1) {
        	p.println("Enter the Principle Amount : ");
        	double principleAmount = sc.nextDouble();
        	p.println("Enter the Rate Of Interest : ");
        	double rateOfInterest = sc.nextDouble();
        	p.println("Enter Time Taken : ");
        	double timeTaken=sc.nextDouble();
        	p.println("Select One :\n1 Simple Interest\n2 Compound Interest");
        	int t = sc.nextInt();
        	switch(t) {
        		case(1):
        			simpleInterest si = new simpleInterest(principleAmount,timeTaken,rateOfInterest);
        			p.println("SIMPLE INTEREST : "+ si.calculation()+"INR");
        			break;
        		case(2):
        			compoundInterest ci = new compoundInterest(principleAmount,timeTaken,rateOfInterest);
        			p.println("COMPOUND INTEREST : "+ci.calculation()+"INR");
        			break;
        	}
        }
        else if(input==2){
        	p.println("Enter The Area Of The House : ");
        	double area=sc.nextDouble();
        	p.println("Select The Material Standards You Prefer: ");
        	p.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int standard = sc.nextInt();
        	houseConstruction hc=new houseConstruction(area,standard);
        	p.println("TOTAL COST : "+hc.total() +"INR");
        }
        else {
        	p.println("Invalid Option");
        }
        p.close();
        sc.close();
    }
}