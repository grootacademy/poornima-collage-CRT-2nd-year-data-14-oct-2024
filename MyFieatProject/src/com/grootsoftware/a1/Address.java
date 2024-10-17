package com.grootsoftware.a1;

public class Address {
	String plotNo;
	String area;
	String dist;
	String pinCode;
	public Address(String plotNo, String area, String dist, String pinCode) {
		this.plotNo = plotNo;
		this.area = area;
		this.dist = dist;
		this.pinCode = pinCode;
	}
	public void printData() {
		System.out.println(plotNo);
		System.out.println(area);
		System.out.println(dist);
		System.out.println(pinCode);
	}
}
