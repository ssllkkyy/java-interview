/**
* @FileName锟斤拷Test5.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 第五题：定义一个文件输入流，调用read(byte[] b)方法 将exercise.txt文件中的所有内容打印出来(byte数组的大小限制为5)。
 */

public class Test05 {
	public static void main(String[] args) throws IOException {
		// 定义文件输入流
		FileInputStream fis = new FileInputStream("exercise.txt");
		// 创建内存输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// 创建字节数组，长度为5
		byte[] arr = new byte[5];

		int len;
		while ((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		// 打印所有内容
		System.out.println(baos);
		fis.close();
	}
}
