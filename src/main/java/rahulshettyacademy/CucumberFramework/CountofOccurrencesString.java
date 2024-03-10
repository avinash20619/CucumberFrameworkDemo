package rahulshettyacademy.CucumberFramework;

public class CountofOccurrencesString {
	public static void main(String args[]) {
String str = "AmrutaAvinash";
int count = 0;
char[] inp = str.toCharArray();
for (int i = 0; i < str.length(); i++) {
	System.out.println(str.charAt(i));	
	for(int j = i+1; j <str.length(); j++) {
	System.out.println(str.charAt(j));	
	{
		
		if (inp[i] == inp[j])
		{
			count++;
		}
		System.out.println("No of occurances Characters are:" +count);
}
}
}
}
}