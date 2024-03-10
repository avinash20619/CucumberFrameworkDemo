package rahulshettyacademy.CucumberFramework;

public class UpperToLowerLowerToUpperCase {
	
	public static void main(String[] args) {
		
		String str = "Computer";
		String resultStr = " ";
		for(int i=0; i<str.length(); i++) {
		if(Character.isLowerCase(str.charAt(i))) {
			resultStr = (String) (resultStr+ Character.toUpperCase(str.charAt(i)));
				
			}
		else 
		    {
			resultStr = (String) (resultStr+ Character.toLowerCase(str.charAt(i)));
		}
		
		System.out.println(resultStr);
		}
	}

}
