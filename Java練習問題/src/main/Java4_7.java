package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java4_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int giants = 0;
		int tigers = 0;

		for(int game = 1; game <= 9; game++) {
			System.out.println(game + "回表、巨人の得点は？");
			giants += Integer.parseInt(br.readLine());

			System.out.println(game + "回裏、阪神の得点は？");
			tigers += Integer.parseInt(br.readLine());
		}
		System.out.println("巨人:" + giants + "点、" + "阪神:" + tigers + "点");

		if(giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if(giants < tigers) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("同点");
		}
	}

}
