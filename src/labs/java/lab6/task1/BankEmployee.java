package labs.java.lab6.task1;

public class BankEmployee extends Person{
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
}
