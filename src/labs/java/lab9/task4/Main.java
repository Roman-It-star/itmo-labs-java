package labs.java.lab9.task4;

public class Main {
    public static void main(String[] args) {
        // Создание пользователя через конструктор
        User user1 = new User("Ivan");
        System.out.println("Created user1 with name: " + user1.getName());

        // Изменение имени через сеттер
        user1.setName("Sergey");
        System.out.println("After setName, user1 name: " + user1.getName());

        // Создание второго пользователя с тем же именем
        User user2 = new User("Sergey");
        System.out.println("Created user2 with name: " + user2.getName());

        // Сравнение через equals
        System.out.println("user1.equals(user2)? " + user1.equals(user2));

        // Печать hashCode для обоих
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
    }
}
