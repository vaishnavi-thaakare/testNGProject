package encapsulationDemo;

public class EncapsulationDemo2 extends EncapsulationDemo {
	public static void main (String[] args) {
		EncapsulationDemo2 obj=new EncapsulationDemo2();
		obj.getFirstName();
		System.out.println(obj.getFirstName());
		obj.setFirstName("Thakare");
		System.out.println(obj.getFirstName());
		
	}

	

}
