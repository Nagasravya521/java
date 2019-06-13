package com.java;

import java.util.Scanner;

public class FibbonacciWithOutLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		
		  fibbonacci(n,a,b,c);

	}
  public static void  fibbonacci(int n,int a,int b,int c) {
	  if(a<=n) {
		  System.out.println(a);
		  
		  c=b;
		  b=a;
		  a=c+b;
		  fibbonacci(n,a,b,c);
	  }
	
	  
  }
}
