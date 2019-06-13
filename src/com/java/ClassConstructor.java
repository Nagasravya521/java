package com.java;

public class ClassConstructor {
	public ClassConstructor() {
		
		System.out.println("non paramiter constructor");
	}
	public ClassConstructor(int a) {
		this();
		System.out.println("int paramiter constructor");
	}
	public ClassConstructor(float f) {
		this(2);
		System.out.println("float paramiter constructor");
	}
	

	public static void main(String[] args) {
		
		ClassConstructor cc=new ClassConstructor();
		ClassConstructor cc1=new ClassConstructor(1);
		ClassConstructor cc2=new ClassConstructor(2f);
	}

}
