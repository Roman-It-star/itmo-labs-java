package labs.java.lab5;

public class SubstringCounter {
    public static int count(String text, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0, idx = 0;
        while ((idx = text.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}
