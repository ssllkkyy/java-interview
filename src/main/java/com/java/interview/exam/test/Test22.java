package com.java.interview.exam.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 需求：有个机器人，有键值对的命令；必须先检测机器开关状态，默认关，在输入命令之前机器必须是开的状态
 * 只要输入命令"拜拜"就结束对话；如果输入没有的命令，机器则回答"对不起，我不知道怎么回答，请换个问题问我"
 * 把人与机器的对话记录存入到"info.txt"文件
 * 
 */
public class Test22 {
	public static void main(String[] args) throws IOException {
		HashMap<String, String> hm = new HashMap<>();
		BufferedWriter fw = new BufferedWriter(new FileWriter("info.txt"));

		hm.put("你好", "你好，主人");
		hm.put("我饿了", "你想吃什么，但是我不会做");
		hm.put("拜拜", "拜拜");
		String answ = "对不起，我不知道怎么回答，请换个问题问我";
		Scanner sc = new Scanner(System.in);

		// 机器人初始关态是关
		String status = "off";
		if (status.equals("off")) {
			// 开启机器人后输入命令进入循环
			status = "on";
			System.out.println("请输入指令：");
			while (true) {
				String order = sc.nextLine();
				if (hm.containsKey(order)) {
					System.out.println(hm.get(order));
					fw.write(order + "-" + hm.get(order));
					fw.newLine();
					if (order.equals("拜拜")) {
						break;
					}

				} else {
					System.out.println(answ);
					fw.write(order + "-" + answ);
					fw.newLine();
				}
			}
			fw.close();
			sc.close();
		}
	}
}
