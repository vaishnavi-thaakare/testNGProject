package methodsInJava;

public class ParameterizedMethods {
	public void method1(String name,int age) {
		System.out.println(name+age);
		
	}
	public static void main(String[] args) {
		
		ParameterizedMethods obj=new ParameterizedMethods();
		obj.method1("vaishnavi",28);
	}

}
