package com.java.interview.question;

import java.util.Arrays;

/**
 * @class: Num2Rmb
 * @desc: 金额转大写
 * @author gxing
 * @date 2018年4月30日
 */
public class Num2Rmb {
	private String[] hanArr = { "零","壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
	private String[] unitArr = { "万", "仟", "佰", "拾" };

	private String[] divide(double num) {
		long zheng = (long) num;
		long xiao = Math.round((num - zheng) * 100);
		return new String[] { zheng + " ", String.valueOf(xiao) };
	}

	private String toHanStr(String numStr) {
		String result = " ";
		int numLen = numStr.length();
		for (int i = 0; i < numLen; i++) {
			int num = numStr.charAt(i) - 48;
			if (i != numLen - 1 && num != 0) {
				result += hanArr[num] + unitArr[numLen - 2 - i];
			} else {
				result += hanArr[num];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Num2Rmb nr = new Num2Rmb();
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
		System.out.println(nr.toHanStr("61009"));
	}
}
