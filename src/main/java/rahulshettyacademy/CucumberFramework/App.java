package rahulshettyacademy.CucumberFramework;

public class App {
	 public static void main(String[] args)
	    {
	        String s = "Java is java again java again";

	        char c = 'b';

	        int count = s.length() - s.replace("b", "").length();

	        System.out.println("Number of occurances of 'a' is: "+count);
	    }
	}