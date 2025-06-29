package labs.java.lab5;

public class LongestWordFinder {
    public static String find(String text) {
        String[] tokens = text.split("\\s+");
        String longest = "";
        for (String t : tokens) {
            if (t.length() > longest.length()) {
                longest = t;
            }
        }
        return longest;
    }
}
