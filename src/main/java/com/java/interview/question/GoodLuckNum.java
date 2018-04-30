package com.java.interview.question;

import java.util.ArrayList;

/**
 * @class: GoodLuckNum
 * @desc: 幸运数字
 * @author gxing
 * @date 2018年4月30日
 */
public class GoodLuckNum {
	public static void main(String[] args) {
		System.out.println(getLastPeople(100));
	}

	public static int getLastPeople(int num) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}

		int count = 1;

		for (int i = 0; list.size() != 1; i++) {

			if (i == list.size()) {
				i = 0;
			}
			if (count % 14 == 0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}
}
