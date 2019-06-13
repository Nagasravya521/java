package com.java;

public class Main_Class extends Basics {

	public static void main(String[] args) {
		Basics mc= new Basics();
		Basics  bc=new Main_Class();
		//Main_Class mc1=new Basics();
		Main_Class mc1=new Main_Class();
		bc.m2();
		mc1.m2();
		mc1.m3();
		//mc.m3();
		//bc.m3();
		Basics.m();
	}
	void m3() {
		System.out.println("m3");
	}

}
