/**
* @FileName锟斤拷Test4.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 第四题：一个ArrayList对象aList中存有若干个字符串元素，现欲遍历该ArrayList对象，
 * 删除其中所有值为"abc"的字符串元素，请用代码实现。
 */

public class Test04
{
	public static void main(String[] args)
	{
		demo1(); // 使用迭代器遍历，if equals判断，调用迭代器自身的remove方法
		demo2(); // for循环遍历加if equals判断
		demo3(); // 没有使用遍历，调用contains 方法，底层是通过indexof判断对象的素引是否为-1来确定元素是否存在
	}

	private static void demo1()
	{
		ArrayList<String> list = new ArrayList<String>();
		// 添加集合对象
		list.add("abc");
		list.add("123");
		list.add("ac1");
		list.add("abc");
		list.add("abc");

		// System.out.println(list);
		// 使用迭代器遍历
		long startTime = System.currentTimeMillis();
		Iterator<String> it = list.iterator();

		while (it.hasNext())
		{
			// 获取每一个集合元素，判断str是否为abc
			if (it.next().equals("abc"))
			{
				// 相同测调用迭代器的remove()方法
				it.remove();
			}
		}
		System.out.println("demo1:" + list);
		long endTime = System.currentTimeMillis();
		// System.out.println(endTime - startTime);
	}

	// ---------------------------------------------------------------------
	private static void demo2()
	{
		// 新建集合，添加若干个字符串元素
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("123");
		list.add("ac1");
		list.add("abc");
		list.add("abc");
		// 对集合进行遍历
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++)
		{
			// 判断是否含 有字符串abc
			if (list.get(i).equals("abc"))
			{
				list.remove(i);
				// System.out.println(list);
				// 再次对已删除的新集合进行遍历，防止相邻的两个元素没有删除
				for (int j = 0; j < list.size(); j++)
				{
					if (list.get(j).equals("abc"))
					{
						list.remove(j);
					}
				}
			}
		}
		System.out.println("demo2:" + list);
		long endTime = System.currentTimeMillis();
		// System.out.println(endTime - startTime);
	}

	// ---------------------------------------------------------------------
	private static void demo3()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("123");
		list.add("ac1");
		list.add("abc");
		list.add("abc");
		list.add("abc");

		long startTime = System.currentTimeMillis();
		// 通过判断集合元素对象的素引是否存在，>=0表示存在，则删除该对象
		while (list.indexOf("abc") >= 0)
		{
			list.remove("abc");
		}

		// while (list.contains(abc))
		// {
		// list.remove("abc");
		// }
		System.out.println("demo3:" + list);
		long endTime = System.currentTimeMillis();
		// System.out.println(endTime - startTime);
	}
}
