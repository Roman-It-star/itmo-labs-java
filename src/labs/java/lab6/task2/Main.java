package labs.java.lab6.task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Client("Alice", "Zephyr", "VTB"),
                new BankEmployee("Bob", "Petrov", "Alfa-Bank"),
                new Client("John", "Doe", "Sberbank")
        };

        for (Person person : people) {
            person.printInfo();               // шаг 1: вывод информации
            if (person instanceof VIP) {      // шаг 2: проверка интерфейса
                boolean vip = ((VIP) person).isVIP();  // шаг 3: вызов метода из интерфейса
                System.out.println("VIP? " + vip);
            }
            System.out.println();
        }
    }
}
