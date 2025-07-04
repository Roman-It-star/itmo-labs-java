package labs.java.lab10.task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
    public static List<String> readLines(String filePath) throws IOException {
        Path path = Path.of(filePath);
        if (Files.notExists(path)) {
            // создаём пустой файл
            Files.createFile(path);
        }
        return Files.readAllLines(path);
    }
}
