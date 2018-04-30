/**
* @FileName��Test4.java
* @Package��com.itchina
* @Description: (�����ļ���ʲô)
* @author��Rocky
* @date�� Oct 24, 2016
* @version�� V1.0
*/
package com.java.interview.question;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * �����⣺һ��ArrayList����aList�д������ɸ��ַ���Ԫ�أ�����������ArrayList����
 * ɾ����������ֵΪ"abc"���ַ���Ԫ�أ����ô���ʵ�֡�
 */

public class SumScore
{
	public static void main(String[] args)
	{
		demo1();	//ʹ�õ�����������if equals�жϣ����õ����������remove����
		demo2();	//forѭ��������if equals�ж�	
		demo3();	//û��ʹ�ñ���������contains �������ײ���ͨ��indexof�ж϶���������Ƿ�Ϊ-1��ȷ��Ԫ���Ƿ����
	}

	private static void demo1()
	{
		ArrayList<String> list = new ArrayList<String>();
		//��Ӽ��϶���
		list.add("abc");
		list.add("123");
		list.add("ac1");
		list.add("abc");
		list.add("abc");

//		System.out.println(list);
		//ʹ�õ���������
		long startTime = System.currentTimeMillis();
		Iterator<String> it = list.iterator();

		while (it.hasNext())
		{
			//��ȡÿһ������Ԫ�أ��ж�str�Ƿ�Ϊabc
			if (it.next().equals("abc"))
			{
				//��ͬ����õ�������remove()����
				it.remove();
			}
		}
		System.out.println("demo1:" + list);
		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
	}
//---------------------------------------------------------------------		
	private static void demo2()
	{
		//�½����ϣ�������ɸ��ַ���Ԫ��
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("123");
		list.add("ac1");
		list.add("abc");
		list.add("abc");
		//�Լ��Ͻ��б���
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++)
		{
			//�ж��Ƿ� ���ַ���abc
			if(list.get(i).equals("abc"))
			{
				list.remove(i);
//				System.out.println(list);
				//�ٴζ���ɾ�����¼��Ͻ��б�������ֹ���ڵ�����Ԫ��û��ɾ��
				for (int j = 0; j < list.size(); j++)
				{
					if(list.get(j).equals("abc"))
					{
						list.remove(j);
					}					
				}
			}
		}
		System.out.println("demo2:" + list);
		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
	}
//---------------------------------------------------------------------	
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
		//ͨ���жϼ���Ԫ�ض���������Ƿ���ڣ�>=0��ʾ���ڣ���ɾ���ö���
		while(list.indexOf("abc") >= 0)
		{
			list.remove("abc");
		}
		
//		while (list.contains(abc))
//		{
//			list.remove("abc");
//		}
		System.out.println("demo3:" + list);
		long endTime = System.currentTimeMillis();
//		System.out.println(endTime - startTime);
	}
}
