package com.java;

public class Students {
	int rollno;
	String name;

	public Students(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
	}

	public static void main(String[] args) {
		Students s=new Students(101,"sravya");
        System.out.println(s);
        String s1="sravya";
        System.out.println(s1);
        String s2="sravya";
        System.out.println(s2);
        String  s3=  s2.concat("chand");
        System.out.println(s3);
        String s4=" this is annanagar green technology ";
        String[] x=s4.split(" ");
        System.out.println(x.length);
        for(int i=0;i<x.length;i++) {
        	System.out.println(x[i]);
        }
        System.out.println(x[2]);
        System.out.println(s3.toUpperCase());
        System.out.println(s4);
	}
    public String toString() {
		return rollno +"  "+ name;
    	
    }
}
