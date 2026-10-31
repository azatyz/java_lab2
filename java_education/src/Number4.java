import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вещественное число");
        double n = input.nextDouble();
        number(n);
    }
    static double number (double number) {
        int intVersion = (int) number;
        double fracPart = number - intVersion;
        System.out.println("Целая часть: " + intVersion);
        System.out.printf("Дробная часть: %.2f%n", fracPart);
        return fracPart;
    }
}