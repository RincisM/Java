import java.util.Scanner;

public class AddUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter num2: ");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		System.out.printf("The Sum of %d and %d is %d", num1, num2, sum);
	}
}