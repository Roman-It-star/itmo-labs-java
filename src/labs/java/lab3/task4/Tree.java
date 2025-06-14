package labs.java.lab3.task4;

public class Tree {
    private Integer years;
    private String treeAlive;
    private String name;

    public Tree(Integer years, String name){
        this.years = years;
        this.name = name;
    }
    public Tree(Integer years, String treeAlive, String name){
        this.years = years;
        this.treeAlive = treeAlive;
        this.name = name;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", years='" + years + '\'' +
                ", treeAlive=" + treeAlive +
                '}';
    }
}
