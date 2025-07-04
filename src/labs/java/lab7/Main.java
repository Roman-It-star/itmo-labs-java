package labs.java.lab7;

public class Main {
    public static void main(String[] args) {
        // Создаём первый самолет с весом крыла 1200.5 кг
        Airplane plane1 = new Airplane(1200.5);
        System.out.println("Самолет 1:");
        plane1.showWingWeight();  // Шаг 1: выводим вес крыла первого самолета

        System.out.println();

        // Создаём второй самолет с весом крыла 1350.75 кг
        Airplane plane2 = new Airplane(1350.75);
        System.out.println("Самолет 2:");
        plane2.showWingWeight();  // Шаг 2: выводим вес крыла второго самолета
    }
}
