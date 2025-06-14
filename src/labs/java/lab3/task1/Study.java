package labs.java.lab3.task1;

public class Study {
    private String course;

    public Study(String cource){
        this.course = cource;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }

}
