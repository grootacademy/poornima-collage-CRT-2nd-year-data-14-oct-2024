package ccom.groo.abstractClassEx.abstractionEx;

import ccom.groo.abstractClassEx.abstractionEx.rbi.RBIBank;
import ccom.groo.abstractClassEx.abstractionEx.sbi.MyFactory;

public class Test {
	public static void main(String[] args) {
		RBIBank sbi=MyFactory.getObj();
		sbi.printRateOfInterst();
	}
}
