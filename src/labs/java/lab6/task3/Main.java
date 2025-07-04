package labs.java.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(1500, "Toyota Corolla", 'B', 180.0f);
        myCar.outPut();
        System.out.println();

        Truck myTruck = new Truck(
                5000,             // вес
                "Volvo FH16",     // модель
                'G',              // цвет (G = Green)
                120.0f,           // скорость
                18,               // колёса
                25000.0           // максимальный грузоподъёмный вес
        );
        myTruck.outPut();
        System.out.println();

        // Меняем колёса у грузовика
        myTruck.newWheels(20);
    }
}
