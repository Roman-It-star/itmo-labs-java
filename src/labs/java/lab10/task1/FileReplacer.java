package labs.java.lab10.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReplacer {
    private static final Pattern NON_ALNUM = Pattern.compile("[^\\p{L}\\p{N}]");
    /**
     * Заменяет в файле все символы, кроме букв и цифр, на '$'.
     * Перезаписывает исходный файл.
     * @param filePath путь к файлу
     * @throws IOException при ошибке IO
     */
    public static void replaceNonAlphanumeric(String filePath) throws IOException {
        Path path = Path.of(filePath);
        // Прочитаем (или создадим) исходный файл
        List<String> lines = FileReader.readLines(filePath);
        List<String> out = new ArrayList<>(lines.size());

        for (String line : lines) {
            Matcher m = NON_ALNUM.matcher(line);
            // quoteReplacement — чтобы '$' воспринимался как символ, а не спец-группа
            out.add(m.replaceAll(Matcher.quoteReplacement("$")));
        }
        // Записываем результат поверх исходного
        Files.write(path, out);
    }
}
