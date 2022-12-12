package oops;

public class InterfaceClass implements AnotherWayOfAbstractClass {

	@Override
	public void method1() {
	System.out.println("This is implemented method");
		
	}
	public static void main(String[] args) {
		InterfaceClass obj=new InterfaceClass();
		obj.method1();
		
	}
	

}
