package labs.java.lab6.task4;

public class Main {
    public static void main(String[] args) {
        // Шаг 1: создаём объект Derived, передавая значение для value
        Derived derived = new Derived(42);
        // Шаг 2: вызываем метод printValue(), который внутри выводит поле value
        derived.printValue();
    }
}
