
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java4_12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;

		System.out.println("数値入力");
		while(x <= 100)
			x += Integer.parseInt(br.readLine());

		System.out.println("合計は" + x);
	}
}