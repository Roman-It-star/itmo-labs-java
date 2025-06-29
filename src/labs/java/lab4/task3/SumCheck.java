package labs.java.lab4.task3;
import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int third = scanner.nextInt();

        boolean result = isSumEqual(first, second, third);
        System.out.println("Результат: " + result);

        scanner.close();
    }

    public static boolean isSumEqual(int x, int y, int z) {
        return x + y == z;
    }
}
