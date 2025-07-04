package labs.java.lab6.task5;

public class PersonChild extends PersonBase {
    public String getName() {
        System.out.print("Введите ваше имя: ");
        return scanner.next();
    }
}
