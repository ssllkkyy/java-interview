/**
* @FileName锟斤拷Test10.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 25, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.util.ArrayList;

/**
 * 第十题：有100个人围成一个圈，从1开始报数，报到14的这个人就要退出。 
 * 然后其他人重新开始，从1报数，到14退出。
 * 问：最后剩下的是100人中的第几个人？
 */

public class Test10 {
	public static void main(String[] args) {
		System.out.println(getLastPeople(100));
	}

	public static int getLastPeople(int num) {
		// 创建集合，存储1-num的数字
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		// 用来计数，只要是第14的倍数的人就退出
		int count = 1;
		// 只要集合中人数超过1个，就要不断计数
		for (int i = 0; list.size() != 1; i++) {
			// 如果i增长到集合最大的索引+1时，重新归零
			if (i == list.size()) {
				i = 0;
			}
			// 如果是14的倍数的人，测退出
			if (count % 14 == 0) {
				// 删除元素时，集后的后面元素会前移，索引后退一位，不会出错和漏元素
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);// 最后剩下的人
	}
}
