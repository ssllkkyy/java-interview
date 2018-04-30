/**
* @FileName: MethodTest1.java
* @Package basice
* @Description: TODO(�������ļ���ʲô)
* @Author Rocky
* @Date 2016��8��9��
* @Version V1.0
*/

package com.java.interview.question;

import java.util.Scanner;

public class ScannerFor_Max
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ��������");
		int x = sc.nextInt();
		System.out.println("����ڶ���������");
		int y = sc.nextInt();	
		int max = getMax(x,y);
		System.out.println("���ֵ��:" + max);
		
		boolean b = isEquals(x,y);
		System.out.println(b);
		
	}
	//�ж������������ֵ
	public static int getMax(int a , int b)
	{
		return a > b ? a : b;
	}
	//�ж��������Ƿ����
	public static boolean isEquals(int m , int n)
	{
		return m == n;
	}
}
