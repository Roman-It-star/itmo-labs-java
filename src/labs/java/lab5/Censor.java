package labs.java.lab5;

public class Censor {
    public static String censor(String text) {
        return text.replace("бяка", "[вырезано цензурой]");
    }
}
