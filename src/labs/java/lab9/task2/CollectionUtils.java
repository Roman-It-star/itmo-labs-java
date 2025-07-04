package labs.java.lab9.task2;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class CollectionUtils {
    public static <T> List<T> removeDuplicates(Collection<T> input) {
        // LinkedHashSet сохраняет порядок и убирает дубли
        return new ArrayList<>(new LinkedHashSet<>(input));
    }
}
