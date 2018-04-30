package com.java.interview.exam.test;

public class Test2 {
	String str = new String("good");
	char[] a = { 'a', 'b', 'c' };

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.change(t.str, t.a);
		System.out.print(t.str + " and ");
		System.out.print(t.a);
	}

	private void change(String str, char[] a) {
		str = "test ok";
		a[0] = 'g';
	}
}
// 结果：good and gbc
// String 对象内容不可变，被final修饰，只能通过构造函数修改