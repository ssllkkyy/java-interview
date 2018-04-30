package com.java.interview.exam.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 第七题：使用TCP协议写一个可以上传文件的服务器和客户端。 服务端
 */
public class Test07_Server {
	public static void main(String[] args) throws IOException {
		// 建立多线程服务器
		ServerSocket server = new ServerSocket(2233);
		System.out.println("服务器启动，绑定2233端口");
		while (true) {
			// 侦听并接受到此套接字的连接。
			final Socket socket = server.accept();
			new Thread() // 创建多线程
			{
				public void run() {
					try {
						// 用字节流来接收
						InputStream inputStream = socket.getInputStream();
						// 将字节流包装成字符流
						BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						// 接收文件名
						String fileName = br.readLine();

						// 文件是否存在，将结果发回客户端
						File dir = new File("update"); // 创建文件夹
						dir.mkdirs();
						File file = new File(dir, fileName); // 封装成file对象
						if (file.exists()) {
							ps.println("存在"); // 如果文件已经存在，将存在返回客户端，不再执行
							socket.close(); // 关闭socket
						} else {
							ps.println("不存在");
						}
						// 定义FileOutputStream
						FileOutputStream fos = new FileOutputStream(file);
						byte[] arr = new byte[8192];
						int len;
						while ((len = inputStream.read(arr)) != -1) {
							fos.write(arr, 0, len);
						}
						fos.close();
						socket.close();

					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}.start();
		}
	}
}