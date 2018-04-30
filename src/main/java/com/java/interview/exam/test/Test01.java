/**
* @FileName锟斤拷Test1.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.util.HashMap;

/**
 * 第一题：取出一个字符串中字母出现的次数。如：字符串："abcdekka27qoq" ，输出格式为：a(2)b(1)k(2)...
 */

public class Test01
{
	public static void main(String[] args)
	{
		// 定义需要统计的字符串，也可用Scanner来输入
		String str = "abcdekka27qoq";
		// 将字符串转换为字符数组
		char[] arr = str.toCharArray();
		// 定义双列集合，存储字符串中字符以及字符出现的次数
		HashMap<Character, Integer> hm = new HashMap<>();
		// 遍历字符数组获取每一个字符，并将字符存储在双列集合中
		for (char c : arr)
		{
			// 不包含键则值为1；包含则根据键获取值，值加1
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		for (Character key : hm.keySet())
		{
			// hm.get(key)根据键来获取值
			System.out.print(key + "(" + hm.get(key) + ")");
		}
	}
}