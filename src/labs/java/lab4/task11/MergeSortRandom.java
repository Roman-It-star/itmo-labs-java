package labs.java.lab4.task11;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSortRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Ошибка: длина массива должна быть не меньше 1");
            scanner.close();
            return;
        }

        int[] arr = generateRandomArray(n, 100); // числа от 0 до 99
        System.out.println("Сгенерированный массив: " + Arrays.toString(arr));

        // Сортировка слиянием
        mergeSort(arr, 0, arr.length - 1);

        // Вывод результата
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

        scanner.close();
    }

    public static int[] generateRandomArray(int n, int bound) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(bound);
        }
        return arr;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            // сортируем левую половину
            mergeSort(arr, left, mid);
            // сортируем правую половину
            mergeSort(arr, mid + 1, right);
            // сливаем две отсортированные половины
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Временные массивы
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Копируем данные
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Индексы для прохода по leftArr, rightArr и основному arr
        int i = 0, j = 0, k = left;

        // Слияние
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        // Остаток из leftArr
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        // Остаток из rightArr
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
