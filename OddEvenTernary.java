import java.util.Scanner;

public class OddEvenTernary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		String evenOdd = (num % 2==0) ? "even number" : "odd number";
		System.out.print(num+" is an "+evenOdd); 
	}
}