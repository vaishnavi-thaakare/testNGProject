package com.inheritance;

public class ChildInheritance extends ParentInheritance{
	public void method2() {
		System.out.println(" This is method B from child class itself");
	}
	public int method3() {
		return 6;
	}
	
	
	public static void main (String[] args) {
		ChildInheritance obj=new ChildInheritance();
		obj.method1();
		obj.method2();
	}

}
