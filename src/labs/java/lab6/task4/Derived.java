package labs.java.lab6.task4;

public class Derived extends Base {
    public Derived(int value) {
        super(value);
    }

    public void printValue() {
        System.out.println("Значение: " + value);
    }
}
