import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String user = (input.nextLine());
		String original = user.toLowerCase();
		String reverse = "";
		int i = (user.length())-1;
		while(i>=0) {
			reverse = reverse + original.charAt(i);
			i--;
		}
		if(original.equals(reverse)) {
			System.out.printf("%s is a Palindrome", user);
		}else {
			System.out.printf("%s is not a Palindrome", user);
		}
	}
}