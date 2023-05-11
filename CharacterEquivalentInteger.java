import java.util.Scanner;
class java {
    public static void main(String[] args) {
        char ch[] = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/'};
        for(char c: ch)
            System.out.println("The Integer Equivalent of "+c+" is "+ (int)c);
    }
}