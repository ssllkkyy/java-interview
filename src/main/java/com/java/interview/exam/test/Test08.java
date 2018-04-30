/**
* @FileName锟斤拷Test8.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

/**
 * 第八题：编写一个方法，模拟equals传入两个字符串，判断两个字符串内容是否完全相同?
 */

public class Test08 {
	public static boolean equals(String s1, String s2) {
		// 通过hashcode来判断，此判断可能不完善，目前想到的只有这种最简单了，此方法没法用于对象比较
		if (s1.hashCode() == s2.hashCode()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s1 = "aaaabbc";
		String s2 = "aaa1abbc";
		System.out.println(equals(s1, s2));
	}
}