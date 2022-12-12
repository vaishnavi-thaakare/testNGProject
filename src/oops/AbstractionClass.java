package oops;

public class AbstractionClass extends AbstractionParent{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println(" Abstract child is here ");
		
	}
	public static void main (String[] args) {
		AbstractionClass obj=new AbstractionClass();
		obj.method2();
		obj.method1();
	}
	

}
