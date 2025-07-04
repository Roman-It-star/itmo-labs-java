package labs.java.lab10.task1;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // 1) Читаем file11.txt (если нет — создастся пустым)
            System.out.println("=== file11.txt ===");
            List<String> f11 = FileReader.readLines("file11.txt");
            f11.forEach(System.out::println);

            // 2) Записываем пару строк в file11.txt
            FileWriter.writeLine("file11.txt", "Добавлена строка 1");
            FileWriter.writeLine("file11.txt", "Добавлена строка 2");

            System.out.println("\n=== file11.txt после записи ===");
            FileReader.readLines("file11.txt").forEach(System.out::println);

            // 3) Склеиваем file11.txt + file2.txt → result.txt
            FileConcatenator.concatenateFiles("file11.txt", "file2.txt", "result.txt");
            System.out.println("\n=== result.txt ===");
            FileReader.readLines("result.txt").forEach(System.out::println);

            // 4) Заменяем всё, кроме букв/цифр, на '$' в result.txt
            FileReplacer.replaceNonAlphanumeric("result.txt");
            System.out.println("\n=== result.txt после замены ===");
            FileReader.readLines("result.txt").forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
