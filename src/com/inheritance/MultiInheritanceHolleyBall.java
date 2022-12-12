package com.inheritance;

public class MultiInheritanceHolleyBall extends MultiInheritanceGame{
	public void HolleyBall() {
		System.out.println(" This is from HolleyBall Class");
	}
	
	public static void main(String[] args) {
		MultiInheritanceHolleyBall obj=new MultiInheritanceHolleyBall();
		obj.Game();
		obj.HolleyBall();
		
	}

}
