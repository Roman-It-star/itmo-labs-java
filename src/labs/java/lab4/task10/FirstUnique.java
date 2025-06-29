package labs.java.lab4.task10;
import java.util.Scanner;

public class FirstUnique {

    public static void main(String[] args) {
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
        // не закрываем scanner, чтобы не мешать другим вводам
        return arr;
    }

    public static Integer findFirstUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == arr[i]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return null;
    }
}
