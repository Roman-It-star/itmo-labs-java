package labs.java.lab6.task2;

public class Client extends Person implements VIP {
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

    @Override
    public boolean isVIP() {
        return getLastName().startsWith("Z");
    }
}
