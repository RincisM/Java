import java.util.Scanner;
class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int numb = input.nextInt();
        System.out.println("Number Square Cube");
        for(int i=0; i<=numb; i++) {
            int sq = i*i;
            int cube = i*i*i;
            System.out.printf("%d\t%d\t%d\n", i, sq, cube);
        }
        input.close();
    }
}