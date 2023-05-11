import java.util.Scanner;
class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, num3, num4, num5;
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
        
        System.out.print("Enter the fourth number: ");
        num4 = scanner.nextInt();
        
        System.out.print("Enter the fifth number: ");
        num5 = scanner.nextInt();

        int max = num1;

        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        if(num4 > max) {
            max = num4;
        }
        if(num5 > max) {
            max = num5;
        }

        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        if (num5 < min) {
            min = num5;
        }

        System.out.println("The Smallest Number is: "+min);
        System.out.println("The Largest Number is: "+max);
        scanner.close();
    }
}