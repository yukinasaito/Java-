package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java5_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int result[] = new int[10];

		for(int i = 0; i < 10; i++) {
			result[i] = Integer.parseInt(br.readLine());
		}

		int n = 0;
		if(n % 2 == 0) {
			System.out.println("偶数:");
		} else {
			System.out.println("奇数:");
		}
		System.out.println();
	}

}
