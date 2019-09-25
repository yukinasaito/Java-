package main;

public class Cat {
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

	public Cat(String type) {
		this.type = type;
	}

	public void SetGender(String gender) {
		this.gender = gender;
	}

	public void Cry() {
		switch (this.type) {
		case "三毛猫":
			System.out.println("ニャー");
			break;
		case "野良猫":
			System.out.println("ニャーニャー");
			break;
		default:
			System.out.println();
			break;
		}
	}

	public void Color() {
		switch (this.type) {
		case "三毛猫":
			System.out.println("茶色");
			break;
		case "野良猫":
			System.out.println("黒");
			break;
		default:
			System.out.println();
			break;
		}
	}

	public void Size() {
		switch (this.type) {
		case "三毛猫":
			System.out.println("10kg");
			break;
		case "野良猫":
			System.out.println("20kg");
			break;
		default:
			System.out.println();
			break;
		}

		if(this.type.equals("三毛猫")) {
			System.out.println("小さい");
		} else if(this.type.equals("野良猫")) {
			System.out.println("大きい");
		}
	}

	/* public static void main(String[] args) {
	 * String size = size();
	 * this.
	 * 
	 * String str1 = "三毛猫";
	 * String str2 = "野良猫";
	 * 
	 * if(str1.equals(str2)) {
	 * System.out.println("str1は、str2より大きい");
	 * } else {
	 * System.out.println("str1は、str2よ小さい");
	 * }
	 * 
	 * } */

	public void ShowProfile() {
		System.out.println("名前は" + name + "で" + age + "歳です。");
		System.out.println("種類は" + type + "の" + gender + "です。");
	}

}
