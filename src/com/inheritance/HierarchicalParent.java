package com.inheritance;

public class HierarchicalParent extends HierachicalGrandParent {
	public void parent() {
		System.out.println(" This is parent method ");
	}
	
	public static void main(String[] args) {
		HierarchicalParent obj=new HierarchicalParent();
		obj.grandParent();
		obj.parent();
	}
	
	

}
