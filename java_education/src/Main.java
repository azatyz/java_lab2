import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Главное меню ---");
            System.out.println("1 - Выполнить расчет (ИМТ)");
            System.out.println("2 - О программе");
            System.out.println("3 - Об авторе");
            System.out.println("4 - Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число от 1 до 4.");
                scanner.next(); // очистка буфера сканера от кривого ввода
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                calculateBMI(scanner);
            } else if (choice == 2) {
                printProgramInfo();
            } else if (choice == 3) {
                printDeveloperInfo();
            } else if (choice == 4) {
                System.out.println("Завершение работы...");
                break;
            } else {
                System.out.println("Неверная команда, попробуйте снова.");
            }
        }
    }

    static void printProgramInfo() {
        System.out.println("Программа: Калькулятор Индекса Массы Тела (ИМТ).");
    }

    static void printDeveloperInfo() {
        System.out.println("Разработчик: Азат");
    }

    static void calculateBMI(Scanner scanner) {
        System.out.print("Введите ваш вес в килограммах: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: Вес должен быть числом.");
            scanner.next();
            return;
        }
        double weight = scanner.nextDouble();

        System.out.print("Введите ваш рост в метрах: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: Рост должен быть числом.");
            scanner.next();
            return;
        }
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Ошибка: Вес и рост должны быть положительными.");
            return;
        }

        double bmi = weight / (height * height);
        System.out.printf("Ваш ИМТ: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Категория: недостаточная масса тела");
        } else if (bmi < 25) {
            System.out.println("Категория: нормальная масса тела");
        } else if (bmi < 30) {
            System.out.println("Категория: избыточная масса тела");
        } else {
            System.out.println("Категория: ожирение");
        }
    }
}