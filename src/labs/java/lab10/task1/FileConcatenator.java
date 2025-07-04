package labs.java.lab10.task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileConcatenator {
    /**
     * Склеивает два текстовых файла: сначала file1, затем file2.
     * Перезаписывает или создаёт новый файл targetPath.
     * @param file1 путь к первому файлу
     * @param file2 путь ко второму файлу
     * @param targetPath путь к результирующему файлу
     * @throws IOException при ошибке IO
     */
    public static void concatenateFiles(String file1, String file2, String targetPath) throws IOException {
        Path target = Path.of(targetPath);

        // Перезаписать: удаляем старый, создаём новый
        if (Files.exists(target)) {
            Files.delete(target);
        }
        Files.createFile(target);

        // Добавляем содержимое первого файла
        List<String> lines1 = FileReader.readLines(file1);
        for (String l : lines1) {
            FileWriter.writeLine(targetPath, l);
        }

        // Добавляем содержимое второго файла
        List<String> lines2 = FileReader.readLines(file2);
        for (String l : lines2) {
            FileWriter.writeLine(targetPath, l);
        }
    }
}
