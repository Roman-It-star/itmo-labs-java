package labs.java.lab3.task3;

public class Main {
    public static void main(String[] args){
        Home home1 = new Home(4, 1945, "Сталинка");
        Home home2 = new Home(9, 2020, "Новостройка");

        System.out.println(home1.toString());
        System.out.println(home2.toString());
        System.out.println(home2.numberBuilding(1945));
    }
}
