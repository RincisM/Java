import java.util.Scanner;

public class AlphabetOrDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = input.next().charAt(0);

		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println(ch+" is an Alphabet");
		} else if(ch>='0' && ch<='9') {
			System.out.println(ch+" is a Digit");
		} else{
			System.out.println(ch+" is neither an Alphabet nor a Digit");
		}
	}
}
		