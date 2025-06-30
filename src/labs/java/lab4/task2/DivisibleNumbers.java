package labs.java.lab4.task2;

public class DivisibleNumbers {public static void main(String[] args) {
    printDivBy3();
    System.out.println();  // разделитель
    printDivBy5();
    System.out.println();  // разделитель
    printDivBy3And5();
}

    public static void printDivBy3() {
        System.out.println("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printDivBy5() {
        System.out.println("Делится на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printDivBy3And5() {
        System.out.println("Делится на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
