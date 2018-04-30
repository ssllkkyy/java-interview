package com.java.interview.exam.math;

public class NoSwapChangeValue {
	public static void main(String[] args) {
		int a = 2;
		int b = 6;

		a = a ^ b;
		System.out.println(a);

		b = b ^ a;
		System.out.println(b);

		a = a ^ b;
		System.out.println(a);
	}
}
