package rahulshettyacademy.CucumberFramework;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b = 1;
        
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}