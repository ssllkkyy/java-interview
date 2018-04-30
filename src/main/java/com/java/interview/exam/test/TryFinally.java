package com.java.interview.exam.test;

import org.junit.Test;

public class TryFinally {
	/**
	 * 问：输入结果是什么?
	 */
	@Test
	public void Foo() {
		try {
			return;
		} finally {
			System.out.println("Finally");
		}
	}
}
// 结果：Finally
// 分析：finally一定会执行
