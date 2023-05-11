import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int digits = 0, original, rem, result=0;
		original = num;
		for(;original!=0; original/=10)
			digits++;
		original = num;
		for(;original!=0; original/=10) {
			rem = original%10;
			result = result + (int)Math.pow(rem, digits);
		}
		if(result==num) {
			System.out.printf("%d is an Armstrong Number",num);
		}else {
			System.out.printf("%d is not an Armstrong Number",num);
		}
	}
}