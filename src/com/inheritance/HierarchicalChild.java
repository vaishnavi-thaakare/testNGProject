package com.inheritance;

public class HierarchicalChild extends HierarchicalParent {
	public void child() {
		System.out.println(" This is from child class");
	}
	
	public static void main(String[] args) {
		HierarchicalChild obj=new HierarchicalChild();
		obj.grandParent();
		obj.parent();
		obj.child();
	
	}

	

}
