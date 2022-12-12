package Inheritance;

public class HierarchicalChild extends HierarchicalParent{
	
	public void child() {
		System.out.println(" This is from child ");
	}
	public static void main (String[] args) {
		HierarchicalChild obj=new HierarchicalChild();
		obj.parent();
		obj.GrandParent();
		obj.child();
	}

}
