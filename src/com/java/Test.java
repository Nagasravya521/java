package com.java;

public class Test extends ClassConstructor {
	public Test() {
		super(2);
		System.out.println(" zero param constructor");
	}

	public static void main(String[] args) {
		Test t=new Test(); 
	}

}
