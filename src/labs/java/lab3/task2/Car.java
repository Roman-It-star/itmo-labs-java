package labs.java.lab3.task2;

import java.awt.*;

public class Car {
    private String color;
    private String name;
    private Integer weight1;

    public Car(){
    }
    public Car(String color){
        this.color = color;
    }
    public Car(String color, Integer weight1){
        this.color = color;
        this.weight1 = weight1;
    }

    public Car(String color, String name, Integer weight1){
        this.color = color;
        this.name = name;
        this.weight1 = weight1;
    }

    public String printCar(){
        return this.color + " " + this.name + " " + this.weight1;
    }


    public static void main(String[] args){

        Car car1 = new Car("Red", "Opel", 505);
        Car car2 = new Car("Blue", "Lada", 405 );
        Car car3 = new Car("White", 505);
        Car car4 = new Car("Blue");
        Car car5 = new Car();

        System.out.println(car1.printCar());
        System.out.println(car2.printCar());
        System.out.println(car3.printCar());
        System.out.println(car4.printCar());
        System.out.println(car5.printCar());
    }
}
