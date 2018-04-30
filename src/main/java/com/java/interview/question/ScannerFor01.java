/**
* @FileName: MethodTest2.java
* @Package basice
* @Description: TODO(�������ļ���ʲô)
* @Author Rocky
* @Date 2016��8��9��
* @Version V1.0
*/

package com.java.interview.question;

import java.util.Scanner;

public class ScannerFor01
{
	public static void main(String[] args)
	{
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int row = sc.nextInt();
		System.out.println("������������");
		int column = sc.nextInt();
		//ֱ�ӵ��Ե���
		print(row,column);
	}
	public static void print(int a, int b)
	{
		for(int i = 1 ; i <= a ; i++)
		{
			for(int j = 1 ; j <= b ; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	//void������ֻ��Ҫ���������Ҫ��ֵ������Ҫʹ��return
//	return; 
	}
}
