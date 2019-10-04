package main;

public class java6_7 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			if(PrimeNumber(i)) {
				System.out.println("素数です" + i);
			} else {
				System.out.println("素数ではない" + i);
			}

		}
	}

	private static boolean PrimeNumber(int i) {

		for(int n = 2; n < i; n++) {
			if(i % n == 0) {
				return false;
			}
		}
		return true;
	}
}
