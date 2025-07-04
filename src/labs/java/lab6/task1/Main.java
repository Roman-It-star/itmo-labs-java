package labs.java.lab6.task1;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Client("Ivan", "Ivanov", "VTB"),
                new BankEmployee("Petr", "Petrov", "Alfa-Bank")
        };

        for (Person person : people) {
            person.printInfo();
        }
    }
}
