package com.creatio.crm.language.basicsJava;

public class Parent  {
	public static int a = 10;
	public static int b = 20;
	public static int c;

	public static void printMessage() {
		System.out.println("I am parent");

	}
	public static void main(String[]args) {
		Child ch=new Child();
		ch.printMyMessage();
		
	}

}
