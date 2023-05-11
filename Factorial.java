import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = input.nextInt();

		int factorial = fact(num);
		System.out.printf("The Factorial of %d is %d", num, factorial);
	}
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		int output = fact(n-1) * n;
		return output;
	}
}