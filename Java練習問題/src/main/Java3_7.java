package main;

import java.util.Scanner;

public class Java3_7 {

	public static void main(String args[]) {

		System.out.print("得点を入力: ");

		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();

		scan.close();

		if(score >= 60) {
			System.out.println("合格です。");
		} else {
			System.out.println("不合格です。");
		}

		if(score >= 80) {
			System.out.println("たいへんよくできました。");
		} else if(score >= 60) {
			System.out.println("よくできました。");
		} else {
			System.out.println("ざんねんでした。");
		}
		if(score >= 80) {
			System.out.println("良");
		} else if(score >= 70) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}
}