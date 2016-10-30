package hw;

import java.util.Scanner;

//讓使用者輸入一正整數n，計算1/(12)+1/(34)+1/(56)+…+1/[(2n1)(2n)]並輸出結果

public class hw04 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一整數");
		int n = scn.nextInt();
		float a = 0;
		for (float i = 1; i <= n; i++) {
			a += (1 / ((2 * i - 1) * 2 * i));
		}
		System.out.println("結果:" + a);
	}

}