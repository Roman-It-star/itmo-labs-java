package labs.java.lab4.task8;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = readArrayFromUser();
        printArray(arr);
    }

    public static int[] readArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Ошибка: длина массива не может быть отрицательной");
            scanner.close();
            System.exit(1);
        }

        int[] arr = new int[n];
        System.out.println("Numbers of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
