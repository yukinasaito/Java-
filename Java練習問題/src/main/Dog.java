package main;

public class Dog {
	String name;
	int age;

	public void SetName(String name) {
		name = "ポチ";
	}

	public void SetAge(int age) {
		age = 10;
	}

	public void ShowProfle() {
		System.out.println("名前は" + name + "です。");
		System.out.println("年齢は" + age + "です。");
	}
}