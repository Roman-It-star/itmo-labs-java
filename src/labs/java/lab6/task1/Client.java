package labs.java.lab6.task1;

public class Client extends Person {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Client: " + getFirstName() + " " + getLastName()
                + ", Bank: " + bankName);
    }
}
