package labs.java.lab2.task2;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(){
        this.title = "Без названия";
        this.author = "Неизвестен";
        this.year = 0;
    }
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public void setTitle(String title){
        if (title != null && !title.isEmpty()){
            this.title = title;
        } else {
            System.out.println("Название не может быть пустым!");
        }
    }

    public void setAuthor(String author){
        if (author != null && !author.isEmpty()){
            this.author = author;
        } else {
            System.out.println("Книга не может быть без автора!");
        }
    }

    public void setYear(int year){
        if (year > 0){
            this.year = year;
        } else {
            System.out.println("Год не может быть отрицательным");
        }
    }

    public void printInfo(){
        System.out.println("Название: " + title + ", Автор: " + author + ", Год:" + year);
    }

}


