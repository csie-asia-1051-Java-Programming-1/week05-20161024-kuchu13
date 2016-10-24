package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021033 黃苡珊
 */

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數");
		int n = scn.nextInt();
		int a = 1;

		while (n > 0) {
			a = a * n;
			n--;
		}
		System.out.println(a);
	}
}