package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java6_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 5;
		int n = 9;

		//数値入力
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());

		System.out.println();

		int max = Math.max(i, n);
		System.out.println(max + "が大きい");
	}

	static int max(int i, int n) {
		if(i > n)
			return i;
		else
			return n;
	}
}
