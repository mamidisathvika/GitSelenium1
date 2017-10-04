package com.icicibank;

public class Deposit implements MiniStatement {

	
	public static void main(String args[])
	{
		Deposit d =new Deposit();
		d.mul();
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Iam implemented mul function in deposit class");
		
	}
}
