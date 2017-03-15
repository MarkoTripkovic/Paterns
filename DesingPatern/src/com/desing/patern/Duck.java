package com.desing.patern;

public abstract class Duck{

	public Duck(){
		System.out.println("duck constructor");
		
	}
	
	
	Flayable flayable;
	
	Quackable quackable;
	
	public void swim(){
		System.out.println("swim");
	}
	
	public void quack(){
		
		quackable.quack();
	}
	public void fly(){
		
		flayable.fly();
		
	}
	
	public abstract void display();
	
	
	
	
	

}
