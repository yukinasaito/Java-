package main;

public class Run {

	public static void main(String[] args) {

		Dog dog = new Dog("柴犬");
		dog.SetName("ポチ");
		dog.SetAge(10);
		dog.SetGender("メス");
		dog.ShowProfle();
		dog.Wow();
		dog.Color();
		dog.Size();
		
		dog = new Dog("秋田犬");
		dog.SetName("太郎");
		dog.SetAge(5);
		dog.SetGender("オス");
		dog.ShowProfle();
		dog.Wow();
		dog.Color();
		dog.Size();
		
	}
}