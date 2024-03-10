package rahulshettyacademy.CucumberFramework;

public class Prime {
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;
        
        if (num1.equals(num2)) {
            System.out.println("num1 == num2");
        } else {
            System.out.println("num1 != num2");
        }
        
        if (num3.equals(num4)) {
            System.out.println("num3 == num4");
        } else {
            System.out.println("num3 != num4");
        }
    }
}