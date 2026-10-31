import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        int N = input.nextInt();
        double sum = 0;
        for (int n = 1; n <= N; n++) {
            sum += Math.pow(A, n);
        }
        System.out.println(sum);
    }
}