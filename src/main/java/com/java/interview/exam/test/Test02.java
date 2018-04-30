/**
* @FileName锟斤拷Test2.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

/**
 * 需求：假设迟到两次以内不扣款，从第三次开始依次扣10,20,30………编写一个方法传入迟到的次数返回所扣的金额
 * PS：比如说一个人迟到了5次那么所扣的金额是：0+0+10+20+30=60元
 */

// 此题本想用递归来做，但一时导不出公式
public class Test02
{
	static int sum = 0;

	public static void main(String[] args)
	{
		System.out.println("累积迟到总扣费:" + getMoney(6));
	}

	public static int getMoney(int n)
	{
		// 前两次不进入循环，从第3次开始计算累加
		for (int i = 3; 2 < i && i <= n; i++)
		{
			sum = sum + (i - 2) * 10;
		}
		return sum;
	}

}
