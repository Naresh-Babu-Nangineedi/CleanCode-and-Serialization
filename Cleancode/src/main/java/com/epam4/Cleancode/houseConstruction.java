package com.epam4.Cleancode;

public class houseConstruction {
	double area;
	int type;
	public houseConstruction(double area, int type) {
		this.area = area;
		this.type = type;
	}
	int[] costsPerSqFeet = {1200,1500,1800,2500};
	public double total() {
		return area*costsPerSqFeet [this.type-1];
	}
}