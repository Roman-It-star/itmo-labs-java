package labs.java.lab3.task4;

public class Main {
    public static void main(String[] args){
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(30,"Береза");
        Tree tree3 = new Tree(50,"Живое дерево","Дуб");

        System.out.println(tree1);
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}
