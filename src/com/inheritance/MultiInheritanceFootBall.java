package com.inheritance;

public class MultiInheritanceFootBall extends MultiInheritanceGame{
	public void game1() {
		System.out.println(" This is from Football");
		
	}
	
	public static void main (String[] args) {
		
		MultiInheritanceFootBall obj=new MultiInheritanceFootBall();
		obj.Game();
        obj.game1();		
	}

}
