import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while (N != 0) {
            if (N % 10 == 2) {
                System.out.println("True");
                return;
            } else if (N % 10 != 2) {
                N /= 10; }
        }
        System.out.println("False");
    }
}
