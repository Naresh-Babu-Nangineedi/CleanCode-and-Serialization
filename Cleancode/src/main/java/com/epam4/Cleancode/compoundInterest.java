package com.epam4.Cleancode;

public class compoundInterest {
	double principleAmount, timeTaken, rateOfInterest;
	public compoundInterest(double principleAmount,double timeTaken,double rateOfInterest) {
		this.principleAmount = principleAmount;
		this.timeTaken = timeTaken;
		this.rateOfInterest = rateOfInterest;
	}
	public double calculation() {
		return Math.round(this.principleAmount*Math.pow(1+this.rateOfInterest/100.0, this.timeTaken));
	}
}