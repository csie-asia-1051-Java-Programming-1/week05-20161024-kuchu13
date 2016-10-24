package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021033 黃苡珊
 */

public class ex03 {

		public static void main(String[] args){
	    	Scanner scn = new Scanner(System.in);
	    	System.out.println("請輸入一整數");
	    	int n = scn.nextInt();
	    	int a = 0;
	    	for(int i=1;i<=n;i++) { 
	    		int k = 1;
	    		for(int j=1;j<=i;j++){
	    			k = k*2;
	    		}
	        	a += k;
	        }
	        System.out.println("結果:"+a);
	    }
	   
	}
	
