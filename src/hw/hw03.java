package hw;

import java.util.Scanner;

//設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000

public class hw03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("請輸入n");
		int n = scn.nextInt();
		int a = 1;
		while (n > 0) {
			if ((int) Math.pow(n, a) > 10000) {
				System.out.println(a);
				break;
			}
			a++;
		}

	}

}