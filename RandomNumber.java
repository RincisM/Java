import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Numbers to generate?: ");
		int num = input.nextInt();
		Random random = new Random();
		System.out.println("The Random Numbers are: ");
		for(int i=1; i<=num; i++) {
			System.out.println(random.nextInt(200));
		}
	}
}