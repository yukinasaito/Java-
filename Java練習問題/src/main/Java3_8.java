package main;

import java.util.Scanner;

public class Java3_8 {

	public static void main(String[] args) {

		System.out.println("得点を入力:");

		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();
		int score2 = scan.nextInt();

		scan.close();

		if((score >= 60) && (score2 >= 60)) {
			System.out.println("合格");
		} else if((score + score2) >= 130) {
			System.out.println("合格");
		} else if((score + score2) >= 100 && ((score >= 90) || (score2 >= 90))) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
}