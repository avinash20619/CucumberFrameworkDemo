package rahulshettyacademy.CucumberFramework;

public class Replacecharactersinstring {
	public static void main(String[] args) {
	String str = "Kn@w Pr@gram";
	 System.out.println("Actual String = " + str);
	 str = str.replace("[@]", " ");
	 System.out.println("String after replacement = " + str);
}
}