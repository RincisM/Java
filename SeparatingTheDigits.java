import java.util.Scanner;
class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int numb = input.nextInt();
        int dig1 = (numb/10000);
        int dig2 = (numb/1000)%10;
        int dig3 = (numb/100)%10;
        int dig4 = (numb/10)%10;
        int dig5 = numb%10;
        System.out.printf("%d\t%d\t%d\t%d\t%d", dig1, dig2, dig3, dig4, dig5);
        input.close();
    }
}