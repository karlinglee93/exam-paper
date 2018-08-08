package com.exam_2017.main;


import java.util.Scanner;

import org.junit.Test;

public class Main {

	// 解救小易
	@Test
	public void test() {
		// Scanner 控制台输入
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// 数组的创建
		int[] row = new int[n];
		int[] column = new int[n];
		int temp, min;

		for (int i = 0; i < n; i++) {
			row[i] = scanner.nextInt();
		}
		for (int j = 0; j < n; j++) {
			column[j] = scanner.nextInt();
		}
		min = row[0] + column[0];
		for (int k = 0; k < n; k++) {
			temp = row[k] + column[k];
			if (temp < min) {
				min = temp;
			}
		}
		System.out.println(min - 2);
	}
}
