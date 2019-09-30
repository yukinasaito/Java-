package main;

import java.util.Scanner;

public class Java4_12 {

	public static void main(String[] args) {

		System.out.println("数値入力：");

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int n = scan.nextInt();
		int m = 0;
		scan.close();

		while(m <= 100) {
			m = i + n;

			System.out.println("合計" + m);
			break;
		}
	}
}