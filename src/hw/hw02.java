package hw;

import java.util.Scanner;

//讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入正整數n");
		int a = scn.nextInt();
		int n = 0;
		int m = 0;
		for (int i = 1; n <= a; i++) {
			n = n + i;
			m++;
		}
		System.out.println("m = " + (m - 1));
	}

}