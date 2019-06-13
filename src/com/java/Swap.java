package com.java;

public class Swap {
	public static void swaping(int a,int b) {
		int temp;
		System.out.println("before swap of two numbers" + a+ "," +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("swap of two numbers" + a+ "," +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         swaping(2,3);
	}

}
