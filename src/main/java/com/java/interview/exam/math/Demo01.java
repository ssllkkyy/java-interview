package com.java.interview.exam.math;

/**
 * 数组中的偶数乘以2
 * 
 * @author Rocky
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		// int a = 10;
		// int b = 20;
		// System.out.println("a:"+a+", b:"+b);
		// change(a,b);
		// System.out.println("a:"+a+", b:"+b);

		int[] arr = { 1, 2, 3, 4, 5 };
		change(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] *= 2;
			}
		}
	}

	// public static void change(int a, int b)
	// {
	// System.out.println("a:"+a+", b:"+b);
	// a = b ;
	// b = a + b;
	// System.out.println("a:"+a+", b:"+b);
	// }

}
