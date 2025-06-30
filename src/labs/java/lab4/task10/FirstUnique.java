package labs.java.lab4.task10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUnique {public static void main(String[] args) {
    int[] arr = readArrayFromUser();
    Integer unique = findFirstUnique(arr);

    if (unique != null) {
        System.out.println("Первое уникальное число: " + unique);
    } else {
        System.out.println("Уникальных чисел не найдено");
    }
}

    public static int[] readArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Ошибка: длина массива должна быть не меньше 1");
            scanner.close();
            System.exit(1);
        }

        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static Integer findFirstUnique(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }
        return null;
    }
}
