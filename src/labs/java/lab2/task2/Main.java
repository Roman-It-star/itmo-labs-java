package labs.java.lab2.task2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.printInfo(); // выводит значения по умолчанию

        Book book2 = new Book("1984", "Джордж Оруэлл", 1949);
        book2.printInfo();

        // Проверим сеттеры с неправильными данными
        book2.setTitle("");
        book2.setAuthor(null);
        book2.setYear(-100);

        // А теперь с правильными
        book2.setTitle("Скотный двор");
        book2.setYear(1945);
        book2.printInfo();
    }
}
