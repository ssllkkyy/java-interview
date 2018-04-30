package com.java.interview.question;

/**
 * @class: NarcissisticNumber
 * @desc: 水仙花数
 * @author gxing
 * @date 2018年4月30日
 */
public class NarcissisticNumber {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 1000; i++) {

			int ge = i % 10;

			int shi = i / 10 % 10;

			int bai = i / 10 / 10 % 10;

			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {

				count = count + 1;
				System.out.println(i);
			}
		}
		System.out.println("count = " + count);
	}
}
