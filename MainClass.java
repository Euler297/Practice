package PrimeNumberDetector;
import java.util.Scanner;

public class MainClass {
	public static void PrimeDetect (int a) {
		boolean prime = true;
		
		if (a % 2 == 0)
			prime = false;
		else {
			for (int i = 3; i < a/2; i = i + 2) {
				if (a % i == 0) {
					prime = false;
				}
			}
		}
		
		if (prime == true) {
			System.out.println("This number is prime number.");
		}
		else
			System.out.print("This number is not prime number.");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int a = s.nextInt();
		
		PrimeDetect(a);
	}

}
