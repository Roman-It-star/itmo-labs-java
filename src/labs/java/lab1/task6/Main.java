package labs.java.lab1.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        }
    }
}
