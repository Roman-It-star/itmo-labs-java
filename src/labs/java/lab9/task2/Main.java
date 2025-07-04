package labs.java.lab9.task2;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> original = Arrays.asList(
                "apple", "banana", "apple",
                "orange", "banana", "kiwi"
        );
        System.out.println("Original list: " + original);

        List<String> unique = CollectionUtils.removeDuplicates(original);
        System.out.println("Without duplicates: " + unique);
    }
}
