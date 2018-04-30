package com.java.interview.exam.test;

/**
 * 需求：a0=1、a1=1、a2=a1+a0、a3=a2+a1，以此类推，请写代码用递归算出a30？
 * 
 * @author Rocky
 *
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println(recursive(30));

	}

	public static int recursive(int i) {
		// int a0=1;
		// int a1=1;
		// int a2=a1+a0;
		// int a3=a2+a1;
		if (i == 0 || i == 1)
			return 1;
		return recursive(--i) + recursive(--i);
	}
}
