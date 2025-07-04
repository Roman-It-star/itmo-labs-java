package labs.java.lab10.task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriter {
    /**
     * Записывает в файл одну строку, добавляя перенос на новую строку.
     * Если файл не существует, создаёт его.
     * @param filePath путь к файлу
     * @param line строка для записи
     */
    public static void writeLine(String filePath, String line) throws IOException {
        Path path = Path.of(filePath);
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        Files.writeString(path,
                line + System.lineSeparator(),
                StandardOpenOption.APPEND);
    }
}
