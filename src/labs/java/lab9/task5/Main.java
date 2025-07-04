package labs.java.lab9.task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();

        Integer score = manager.getScore(name);
        if (score != null) {
            System.out.println("У пользователя " + name + " " + score + " очков.");
        } else {
            System.out.println("Пользователь с именем " + name + " не найден.");
        }
        scanner.close();
    }
}
