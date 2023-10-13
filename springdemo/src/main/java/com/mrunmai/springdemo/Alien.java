package com.mrunmai.springdemo;

public class Alien {
	public Alien() {
		System.out.println("Alien object created...");
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("age assigned...");
		this.age = age;
	}

	public void code() {
		System.out.println("I am coding...");

	}
}
