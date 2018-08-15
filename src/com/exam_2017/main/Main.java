package com.exam_2017.main;

import java.util.Scanner;

import org.junit.Test;

public class Main {

	// 网格走法数目（不会）
	// 链接：https://www.nowcoder.com/questionTerminal/e27b9fc9c0ec4a17a5064fb6f5ab13e4
	// 这是一个典型的递归算法问题，因为每次走法必须是往右或者是往下，因此不管是到达那个点，它的必经之路一定是它上方或者左方相邻的那个点，
	// 因此可以得出一个递归表达式：走法数目f[m][n]=f[m-1][n]+f[m][n-1]；
	// 这个递归表达式的条件为m,n都不为0的时候，除了这个表达式还需要写出一个已知条件，
	// f[0][0] = 0;f[i][0] = 1;f[0][j] = 1;这样就可以解出最终f[m][n]的值了
	// 总结，该递归思路还是要慢慢理解的。而且System.out一定要在方法里写
	// 且main函数是static类型的，它所调用的方法也要static类型
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(countNum(x, y));
	}

	public int countNum(int x, int y) {
		if (x == 0 && y == 0) {
			return 0;
		} else if (x == 0 || y == 0) {
			return 1;
		}
		return countNum(x - 1, y) + countNum(x, y - 1);
	}

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
