package com.desing.patern;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackable = new MuteQuack();
		flayable = new Fly();
		System.out.println("Mallard Duck");
	}
	
	@Override
	public void display() {
		System.out.println("Mallard Duck display");
		
	}
	

	
	
	

}
