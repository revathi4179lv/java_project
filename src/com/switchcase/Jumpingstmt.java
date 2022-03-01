package com.switchcase;

public class Jumpingstmt {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
			break; // terminate the loop when the condition is true
			}
			System.out.println(i);
			}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i > 5) {
			break; // terminate the loop when the condition is true
			}
			System.out.println(i);
			}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i > 5) {
			continue; // skip the loop when the condition is true
			}
			System.out.println(i);
			}
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
			continue; //skip the loop of that value
			}
			System.out.println(i);
			}
		
	}

}
