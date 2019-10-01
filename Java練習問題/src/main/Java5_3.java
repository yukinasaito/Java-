package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java5_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数値を入力");

		int result[] = new int[10];
		int n = 0;
		for(int i = 0; i < 10; i++) {
			result[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("偶数");
		for(int i = 0; i < 10; i++) {
			if(result[i] % 2 == 0) {
				System.out.println(result[i] + "");
			}
		}
		System.out.println("奇数");
		for(int i = 0; i < 10; i++) {
			if(result[i] % 2 != 0) {
				System.out.println(result[i] + "");
			}
		}
	}
}
