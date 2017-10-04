package com.icicibank;

public class WithDraw {
int a=10,b=20;
String name="Selenium";
public void add(){
System.out.println("Addtion of 2 numbers");
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Selenium");
		
		WithDraw w  = new WithDraw();
		System.out.println(w.a);
		System.out.println(w.b);
		System.out.println(w.name);
		w.add();
		WithDraw w1 =new WithDraw();
		System.out.println(w1.a);
		System.out.println(w1.b);
		System.out.println(w1.name);
		w1.add();
		
		
	}

}
