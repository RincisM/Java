
import java.util.Scanner;

public class ReversingANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = input.nextInt();
		int original = num;
		int reverse = 0;
		while(num!=0) {
			reverse = (reverse*10) + num%10;
			num = num/10;
		}
		System.out.printf("Reverse of %d is %d", original, reverse);
	}
}