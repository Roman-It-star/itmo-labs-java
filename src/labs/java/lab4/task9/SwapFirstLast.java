package labs.java.lab4.task9;
import java.util.Arrays;
import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        int[] arr = readArrayFromUser();
        System.out.println("Array 1: " + Arrays.toString(arr));

        int[] swapped = swapFirstAndLast(arr);
        System.out.println("Array 2: " + Arrays.toString(swapped));
    }

    public static int[] readArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Ошибка: длина массива должна быть как минимум 1");
            scanner.close();
            System.exit(1);
        }

        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Не закрываем scanner, чтобы не мешать последующим вводам
        return arr;
    }

    public static int[] swapFirstAndLast(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        if (arr.length > 1) {
            int temp = result[0];
            result[0] = result[result.length - 1];
            result[result.length - 1] = temp;
        }
        return result;
    }
}
