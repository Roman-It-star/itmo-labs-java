package labs.java.lab4.task5;
import java.util.Scanner;

public class FirstLastCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива (>= 2): ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Ошибка: длина массива должна быть не меньше 2");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean result = isFirstOrLastThree(arr);
        System.out.println("Результат: " + result);

        scanner.close();
    }

    public static boolean isFirstOrLastThree(int[] arr) {
        return arr[0] == 3 || arr[arr.length - 1] == 3;
    }
}
