package labs.java.lab6.task3;

public class Truck extends Car{
    private int wheelCount;       // количество колёс
    private double maxLoadWeight; // максимальный грузоподъёмный вес

    public Truck(int w, String m, char c, float s,
                 int wheelCount, double maxLoadWeight) {
        super(w, m, c, s);          // инициализируем поля Car
        this.wheelCount = wheelCount;
        this.maxLoadWeight = maxLoadWeight;
    }

    public void newWheels(int newCount) {
        this.wheelCount = newCount;
        System.out.println("Новое количество колёс: " + this.wheelCount);
    }

    @Override
    public void outPut() {
        super.outPut();  // сначала выводим всё, что делает Car.outPut()
        System.out.println("Количество колёс: " + wheelCount);
        System.out.println("Максимальный вес: " + maxLoadWeight + " кг");
    }
}
