package Inheritance;

public class HierarchicalParent extends HierarchicalGrandParent {
	
	public void parent() {
		System.out.println(" This is from parent method ");
	}
	
	
	public static void main(String[] args) {
		HierarchicalParent obj=new HierarchicalParent();
		obj.GrandParent();
		
	}

}
