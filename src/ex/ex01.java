package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021033 黃苡珊
 */

public class ex01 {

		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數");
		int n = scn.nextInt();
		int a = 1;
		for (int i = n; i > 0; i--) {
			a = a * i;
		}
		System.out.println(a);
	}

}