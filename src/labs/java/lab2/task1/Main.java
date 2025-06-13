package labs.java.lab2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = scanner.next();
        double result = 0;

        switch (operation){
            case "+":
                result = calc.sum(a, b);
            break;
            case "-":
                result = calc.subtract(a, b);
                break;
            case "*":
                result = calc.multiply(a, b);
                break;
            case "/":
                result = calc.divide(a, b);
                break;
            default:
                System.out.println("Неизвестная операция!");
                return;
        }
        System.out.println("Результат: " + result);
    }
}
