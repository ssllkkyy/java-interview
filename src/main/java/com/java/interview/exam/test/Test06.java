/**
* @FileName锟斤拷Test6.java
* @Package锟斤拷com.itchina
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 25, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

/**
 * 第六题： 某班级考试成绩如下，利用二维数组存储这些数据，统计出全班的平均成绩，并将所有低于平均分的同学的坐标输出到控制台。 比如：“第1组，第3个同学”
 * 第1组：89,66,54 第2组：77,93,68 第3组：55,45,88 第4组：71,76,75
 */
public class Test06 {
	public static void main(String[] args) {
		// 定义一个二维数组
		int[][] score = { { 89, 66, 54 }, { 77, 93, 68 }, { 55, 45, 88 }, { 71, 76, 75 } };
		int sum = 0; // 定义总成绩，记录每次相加的结果
		int count = 0; // 统计人数
		float avg = 0; // 定义平均分数

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
			}
			count = score.length * score[i].length;
		}
		avg = sum / count;
		System.out.println("平均成绩：" + avg);

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// 判断，如果低于平均数则输出
				if (score[i][j] < avg) {
					System.out.println("第" + (i + 1) + "组，第" + (j + 1) + "个同学低于平均数");
				}
			}
		}
	}
}
