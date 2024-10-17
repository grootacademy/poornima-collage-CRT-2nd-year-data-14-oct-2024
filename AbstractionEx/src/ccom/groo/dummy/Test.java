package ccom.groo.dummy;

public class Test {
	public static void main(String[] args) {
		ABC a=XYZ.getObj();
		System.out.println(a.data);
		a.say();
	}
}
class ABC{
	int data=100;
	public void say() {
		System.out.println("Data :: "+data);
	}
}
class XYZ {
	public static ABC getObj() {
		return new ABC();
	}
}