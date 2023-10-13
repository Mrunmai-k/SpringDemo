package com.mrunmai.springdemo;

public class Alien {
	private int age;	
//	private Laptop laptop;
	private Computer comp;
	
//	use constructor injection when property is compulsory to be assigned with value and for optional go for setter injection.
	
	public Alien() {
		System.out.println("Alien object created...");
	}

//	public Alien(int age) {
//		this.age = age;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age assigned...");
		this.age = age;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public void code() {
		System.out.println("I am coding...");
		comp.compile();
	}
}
