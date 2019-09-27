package main;

import java.util.Scanner;

public class Java4_12 {

	public static void main(String[] args) {

		System.out.println("数値入力：");

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		scan.close();
		while(i <= 100) {
			System.out.println("合計" + i);
			break;
		}
	}
}
