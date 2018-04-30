/**
* @FileName: MethodIsEquals.java
* @Package basice
* @Description: TODO(�������ļ���ʲô)
* @Author Rocky
* @Date 2016��8��10��
* @Version V1.0
*/

package com.java.interview.question;
/*
 * �Ƚ�����ֵ�Ƿ����
 * */
public class ValueEquals
{
	public static void main(String[] args)
	{
		boolean b1 = isEquals(10,11);
		System.out.println(b1);
		
		boolean b2 = isEquals(10,10);
		System.out.println(b2);
	}
	public static boolean isEquals(int a, int b)
	{
		return a == b;
	}
	
	public static boolean isEquals(double a, double b)
	{
		return a == b;
	}
}
