package ccom.groo.abstractClassEx.abstractionEx.sbi;

import ccom.groo.abstractClassEx.abstractionEx.rbi.RBIBank;

public class MyFactory {
  public static RBIBank getObj() {
	  return new SBIBank();
  }
}
