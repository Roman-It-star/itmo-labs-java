package labs.java.lab7;

public class Airplane {
    public class Wing {
        private double weight;  // вес крыла в килограммах

        public Wing(double weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " кг");
        }
    }
    private Wing wing;

    public Airplane(double wingWeight) {
        // создаём вложенный объект Wing для данного Airplane
        this.wing = new Wing(wingWeight);
    }

    public void showWingWeight() {
        wing.showWeight();
    }
}
