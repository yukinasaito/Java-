package main;

public class Java6_6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			kuku(i);
		}

	}

	//結果
	private static void kuku(int i) {
		for(int n = 1; n <= 9; n++) {
			System.out.printf("%2d", n * i);
		}
		System.out.println();
	}

}
