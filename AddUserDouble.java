import java.util.Scanner;

public class AddUserDouble {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1: ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter num2: ");
		double num2 = input.nextDouble();

		input.close();

		double sum = num1 + num2;
		System.out.printf("The Sum of %.2f and %.2f is %.2f", num1, num2, sum);
	}
}