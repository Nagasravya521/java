package com.java;

import java.util.Scanner;

public class Fibonnacci {
static int a=0;
	public static void main(String[] args) {
		int f ,b=1;
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the  number");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   System.out.println(a);
    	   f=a+b;
    	  a=b;
    	  b=f;
    	   
       }
	}

}
