/**
* @FileName锟斤拷Test7.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 25, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 第七题：使用TCP协议写一个可以上传文件的服务器和客户端。 客户端
 */
public class Test07_Client {
	public static void main(String[] args) {
		try {
			// 提示输入要上传的文件路径，验证路径是否存在及是否文件夹
			File file = getfile();
			// 发送文件名到服务端
			Socket socket = new Socket("127.0.0.1", 2233);
			// 缓存包装流，包装转换流
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintStream ps = new PrintStream(socket.getOutputStream());
			// 把文件名发给服务端(打印文件名并发给服务端)
			ps.println(file.getName());
			// 接收结果，如果存在给予提示，程序直接退出
			String result = br.readLine();
			if ("存在".equals(result)) {
				System.out.println("你上传的文件已经存在，请不要重复上传");
				socket.close();
				return;
			}
			// 如果不存在，定义FileInputStream字节流读取文件，字节流可以读取任何文档
			FileInputStream fis = new FileInputStream(file);
			byte[] arr = new byte[8192];
			int len;
			while ((len = fis.read(arr)) != -1) {
				ps.write(arr, 0, len);
			}

			fis.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static File getfile() {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径");
		while (true) {
			String line = sc.nextLine();
			// 将输入路径封装成对象
			File file = new File(line);
			if (!file.exists()) {
				System.out.println("你录入的路径不存在，请重新输入");
			} else if (file.isDirectory()) {
				System.out.println("你录入的是文件夹路径，请重新输入");
			} else {
				return file;
			}
		}
	}
}
