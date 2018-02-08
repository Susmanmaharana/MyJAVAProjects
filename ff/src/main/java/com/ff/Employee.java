package com.ff;

public class Employee {
	public static void main(String[] args) {
		String str1 = "susman";
		String str2 = str1.intern();
		System.out.println(str1 + "    " + str2);
	}
}
