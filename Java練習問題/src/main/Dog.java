package main;

public class Dog {

	String name;
	int age;
	String type;
	String gender;

	public void SetName(String name) {
		this.name = name;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public Dog(String type) {
		this.type = type;

	}

	public void SetGender(String gender) {
		this.gender = gender;
	}

	public void Wow() {
		switch (this.type) {
		case "柴犬":
			System.out.println("ワンワン");
			break;
		case "秋田犬":
			System.out.println("キャンキャン");
			break;
		default:
			System.out.println();
			break;
		}
	}

	public void Color() {
		switch (this.gender) {
		case "メス":
			System.out.println("黒");
			break;
		case "オス":
			System.out.println("茶色");
			break;
		default:
			System.out.println();
			break;

		}
	}

	public void Size() {
		switch (this.type) {
		case "柴犬":
			System.out.println("弱い");
			break;
		case "秋田犬":
			System.out.println("強い");
			break;
		default:
			System.out.println();
			break;

		}
	}

	public void ShowProfle() {
		System.out.println(name + "は、" + age + "歳で" + type + "です。");
		System.out.println("性別は" + gender + "です。");
	}

}
