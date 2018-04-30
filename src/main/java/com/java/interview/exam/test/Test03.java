/**
* @FileName锟斤拷Test3.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 第三题：编写一个java程序将100,101,102,103,104,105这6个数以数组的形式
 * 写入到D:\\test.txt文件中， * 并以相反的顺序读出显示在控制台上。
 */

public class Test03
{
	public static void main( String args[] ) throws IOException
	{
		int[] data = {100,101,102,103,104,105};
		//按顺序写把数字数组写进文件
		BufferedWriter  bw = new BufferedWriter (new FileWriter("d:\\test.txt"));
		//遍历数组并写入到文件
		for(int i=0; i<data.length; i++)
		{
			bw.write(data[i] + ",");
			//这种写入不好分割
//			bw.write("[" + data[i] + "]");
		}
		bw.close();	
		
		BufferedReader br = new BufferedReader(new FileReader("d:\\test.txt"));
		//读取整行
		String content = br.readLine();
//		System.out.println(content);
		//整行通过逗号进行分割存为数组类型
		String[] strArry = content.split(",");
		//返顺遍历数组并输出
		for (int i = strArry.length -1 ; i >=0 ; i--)
		{
			System.out.println(strArry[i]);	
		}
		br.close();
	}
}
