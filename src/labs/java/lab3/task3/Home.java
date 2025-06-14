package labs.java.lab3.task3;

import java.sql.PreparedStatement;

public class Home {
    private Integer numberFloors;
    private Integer yearConstruction;
    private String name;

    public Home(Integer numberFloors, Integer yearConstruction, String name){
        this.numberFloors = numberFloors;
        this.yearConstruction = yearConstruction;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", yearConstruction='" + yearConstruction + '\'' +
                ", numberFloors=" + numberFloors +
                '}';

    }

    public String numberBuilding(Integer yearConstruction){
        int years = 2025 - yearConstruction;
        return "Количество лет с момента постройки: " + years;
    }
}
