package labs.java.lab6.task5;

public class Main {
    public static void main(String[] args) {
        // Шаг 1: создаём объект-наследник PersonChild
        PersonChild person = new PersonChild();

        String name = person.getName();

        int age = person.getAge();

        System.out.println("Привет, " + name + "! Твой возраст: " + age);
    }
}
