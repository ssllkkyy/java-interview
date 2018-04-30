package com.java.interview.exam.test;

import java.util.Random;

/**
 * 100个包子，开了四个窗口同时开始卖
 * 
 * @author Rocky
 *
 */
public class Test21 {
	public static void main(String[] args) {
		new baozi().start();
		new baozi().start();
		new baozi().start();
		new baozi().start();
		new baozi().start();
	}
}

class baozi extends Thread {
	// 共100个包子
	private static int baozis = 100;
	Random rd = new Random();
	int count = 0; // 卖出总数

	public void run() {
		while (true) {
			// 卖1-5个随机数
			int num = rd.nextInt(5) + 1;
			synchronized (baozi.class) {
				if (baozis <= 0) {
					System.out.println(getName() + "包子已卖完");
					break;
				}

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (num > baozis) {
					num = baozis;
				}
				count = count + num;
				baozis = baozis - num;
				System.out.println("本次卖出：" + num + " " + getName() + "共卖出" + count + "个包子 " + ",还剩" + baozis + "个包子");
			}
		}
	}
}