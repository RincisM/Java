import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the No.of Terms: ");
		int num = input.nextInt();
		int first=0, second =1, i=1;
		while(i<=num) {
			System.out.print(first+", ");
			int next = first + second;
			first = second;
			second = next;
			i++;
		}
	}
}
		