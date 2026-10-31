import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double summa = 0;
        for (int n = 1; n <= N; n++) {
            if (n == 1) {
                continue;
            }
            summa = summa + (1 / Math.log(n));
        }
        System.out.println(summa);
    }
}

