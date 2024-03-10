package rahulshettyacademy.CucumberFramework;

import java.util.Arrays;

public class Anagram {
	 public static void main(String[] args) {
/* Function to check whether two strings
	       are anagram of each other */
	    
	        // Get lengths of both strings
	       String s1 = "LISTEN";
	       String s2 = "SILENT";
	       char c1[] =  s1.toCharArray();
	       char c2[] =  s2.toCharArray();
	        // If length of both strings is not
	        // same, then they cannot be anagram
	        if (c1.length != c2.length)
	           System.out.println("Not Anagram");
	           System.exit(0);
	           {
	        // Sort both strings
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	 
	        // Compare sorted strings
	        for (int i = 0; i < c1.length; i++)  
	            if (c1[i] != c2[i])
	            {
	            	System.out.println("Not Anagram");
	           System.exit(0);
	    }
	 
	}
	 System.out.println("Anagram");
	 
}
}
	 