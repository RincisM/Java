import java.util.Scanner;

public class QuotRem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Num1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Num2: ");
		int num2 = input.nextInt();
		
		int quotient = num1 / num2;
		int reminder = num1 % num2;

		System.out.printf("Quotient: %d\nReminder: %d",quotient, reminder);
	}
}