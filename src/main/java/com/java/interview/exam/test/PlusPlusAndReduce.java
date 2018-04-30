package com.java.interview.exam.test;

import org.junit.Test;

public class PlusPlusAndReduce {
	/**
	 * 问：输出i和j的值分别是多少？
	 */
	@Test
	public void Print1() {
		int i = 1;
		int j = 10;
		do {
			if (i++ > --j)
				continue;
			// i运算后+1，
			// j先-1，再运算
			// i=5时，不小于5，跳出循环
			System.out.println(i + "-----" + j);
		} while (i < 5);
	}
	// 结果：
	// 2-----9
	// 3-----8
	// 4-----7
	// 5-----6
}
