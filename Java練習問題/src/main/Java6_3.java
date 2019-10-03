package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java6_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数値入力");

		int i;
		int n;

		//数値入力
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());

		System.out.println(max(z, max(x, y)) + "が一番大きい");

	}

	public static int max(int i, int n) {
		if(i > n)
			return i;
		else
			return n;
	}
}
