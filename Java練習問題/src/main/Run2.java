package main;

public class Run2 {

	public static void main(String[] args) {

		Cat cat = new Cat("三毛猫");
		cat.SetName("たま");
		cat.SetAge(3);
		cat.SetGender("オス");
		cat.ShowProfile();
		cat.Color();
		cat.Cry();
		cat.Size();

		cat = new Cat("野良猫");
		cat.SetName("みーちゃん");
		cat.SetAge(5);
		cat.SetGender("メス");
		cat.ShowProfile();
		cat.Color();
		cat.Cry();
		cat.Size();
	}

}
