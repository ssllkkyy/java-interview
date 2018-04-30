package com.java.interview.exam.forloop;

/**
 * 面试题 考的就是for(初始化语句; 判断条件; 循环条件) ，现在详细解析一下！ 
 * 1. 初始化语句只执行一次 
 * 2. 循环条件最后执行 解题：
 * i=0,输出：ABDC i=1,输出：BDC i=2,执行条件判断，执行foo('B')方法，i条件不满足，跳出，输出B 
 * 最后结果：ABDCBDCB
 * 
 * @author Rocky
 *
 */
public class ForTest {
	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); foo('B') && (i < 2); foo('C')) {
			i++;
			foo('D');
		}
	}

	private static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
}
