package labs.java.lab5;

public class WordReverser {
    public static String reverse(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
