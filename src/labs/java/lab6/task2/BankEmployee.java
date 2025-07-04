package labs.java.lab6.task2;

public class BankEmployee extends Person implements VIP {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Bank Employee: " + getFirstName() + " " + getLastName()
                + ", Bank: " + bankName);
    }

    @Override
    public boolean isVIP() {
        // Пример: VIP, если имя содержит букву "A"
        return getFirstName().contains("A");
    }
}
