package com.groot.assosiation;

public class Address {
		String plotno;
		String area;
		String dist;
		String pinCode;
		public Address(String plotno, String area, String dist, String pinCode) {
			this.plotno = plotno;
			this.area = area;
			this.dist = dist;
			this.pinCode = pinCode;
		}
		public void printDetials() {
			System.out.println(plotno);
			System.out.println(area);
			System.out.println(dist);
			System.out.println(pinCode);
		}
}
