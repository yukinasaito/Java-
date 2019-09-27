package main;

import java.util.Scanner;

public class Java4_11 {

	public static void main(String[] args) {

		System.out.print("得点を入力: ");

		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();

		scan.close();
		for(int i = 0; i < score; i++) {
			System.out.println(i % 10);
		}
	}
}
