package rahulshettyacademy.CucumberFramework;

public class DuplicateArrayElement {

	public static void main(String[] args) {      
        
        //Initialize array   
		int arr []={10,20,30,40,30,20};
		
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
                
            }  
        }  
    }  
}  