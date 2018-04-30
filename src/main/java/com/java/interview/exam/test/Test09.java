/**
* @FileName锟斤拷Test9.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 24, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

/**
 * 金额转换，阿拉伯数字转换成中国传统形式。
 * 例如：101000001010   转换为   壹仟零壹拾亿零壹仟零壹拾圆整   
 */
//老师这题我想到一些思路，但这个数值101000001010太大了，还是完不成，又不愿照抄网上的答案

import java.util.Arrays;

public class Test09 {
	private String[] hanArr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
	private String[] unitArr = { "拾", "佰", "仟", "萬" };

	private String toHanStr(String numStr) {
		String result = " ";
		int numLen = numStr.length();
		// 依次遍历数字字符串的每一位数字
		for (int i = 0; i < numLen; i++) {
			// 把char型整数转换成 int整数字，因为它们的ASCII码值恰好相差48
			// 因此把char型数字减去48得到 int型数字，例如'4'被转换成4
			int num = numStr.charAt(i) - 48;
			// 如果不是最后一位数字，而且数字不是零，则需要添加单位（仟、佰、拾）
			if (i != numLen - 1 && num != 0) {
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}
			// 否则不要添加单位
			else {
				result += hanArr[num];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Test09 nr = new Test09();
		// 把一个四位数字字符串变成汉字字符串
		System.out.println(nr.toHanStr("1010"));
	}
}