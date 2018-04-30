package com.java.interview.exam.math;

import org.junit.Test;

public class Demo05
{
	@Test
	public void shortTest()
	{
		short s1 = 1;
		s1 = (short) (s1 + 1);	//需要强制类型转换
		System.out.println(s1);
		
		s1+=1;
		System.out.println(s1);
	}
	
	@Test
	public void mathRadom()
	{
//		int a = (int) Math.round(10.4);
		System.out.println(Math.round(10.4));
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(-10.5));
		System.out.println(Math.round(-10.3));
	}
}
