package ccom.groo.abstractClassEx;

public class Test {
	public static void main(String[] args) {
		XYZ xyz=new XYZ();
		xyz.say();
		xyz.hello();
	}
}
abstract class ABC{
	ABC(int a){
		System.out.println("constructor with parameter");
	}
	public abstract void say();
	public void hello() {
		System.out.println("Hello from class ABC");
	}
}
class XYZ extends ABC{
	public XYZ() {
		super(10);
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Hello from XYZ");
	}
	
}
