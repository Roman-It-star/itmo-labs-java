package labs.java.lab4.task7;
import java.util.Scanner;

public class SortedCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Ошибка: длина массива должна быть положительным числом");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (isSortedAscending(arr)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        scanner.close();
    }
    
    public static boolean isSortedAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
