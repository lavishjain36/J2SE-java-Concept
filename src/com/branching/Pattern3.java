package com.branching;

public class Pattern3 {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i+=2) {
			System.out.print(i+" ");//0 4 8
			i=i+2;//2
		}
	}

}

//i+=2 or i=i+2