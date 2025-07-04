package labs.java.lab6.task5;
import java.util.Scanner;
public class PersonBase {
    protected Scanner scanner = new Scanner(System.in);

    public int getAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }
}
