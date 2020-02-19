package com.epam4.Cleancode;

public class simpleInterest {
	double principleAmount, timeTaken, rateOfInterest;
	public simpleInterest(double principleAmount, double timeTaken, double rateOfInterest) {
		this.principleAmount = principleAmount;
		this.timeTaken = timeTaken;
		this.rateOfInterest = rateOfInterest;
	}
	public double calculation() {
		return Math.round((this.principleAmount*this.timeTaken*this.rateOfInterest)/100.0);
	}
}