package labs.java.lab6.task3;

public class Car {
    public int weight;     // вес машины в килограммах
    public String model;   // модель машины
    public char color;     // цвет (символом, например 'R' для Red)
    public float speed;    // максимальная скорость

    public Car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car() {}

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }
}
