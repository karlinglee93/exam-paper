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

	// 游戏任务标记
	@Test
	public void test1() {
		// 做这个题的时候main函数写错了，Scanner未import
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[32][32];
		int num1 = scanner.nextInt() - 1;
		int num2 = scanner.nextInt() - 1;
		int row1 = num1 / 32;
		int column1 = num1 % 32;
		arr[row1][column1] = 1;

		int row2 = num2 / 32;
		int column2 = num2 % 32;
		if (num1 < 0 || num1 > 1023 || num2 < 0 || num2 > 1023) {
			System.out.println(-1);
		} else if (arr[row2][column2] == 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
