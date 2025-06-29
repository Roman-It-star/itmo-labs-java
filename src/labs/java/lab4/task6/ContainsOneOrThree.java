package labs.java.lab4.task6;
import java.util.Scanner;

public class ContainsOneOrThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива (>= 1): ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Ошибка: длина массива должна быть не меньше 1");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean result = containsOneOrThree(arr);
        System.out.println("Результат: " + result);

        scanner.close();
    }

    public static boolean containsOneOrThree(int[] arr) {
        for (int num : arr) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }
}
