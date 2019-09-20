package main;

public class Dog {

	String name;
	int age;
	String str;
	int gender;

	public void SetName(String name) {
		this.name = name;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public Dog(String str) {
		this.str = str;
	}

	public int getGender() {
		return gender;
	}

	public void SetGender(String string) {
		this.gender = gender;
	}

	public void ShowProfle() {
		System.out.println(name + "は、" + age + "歳で" + str + "です。");
		System.out.println("性別は" + gender + "です。");
	}
}