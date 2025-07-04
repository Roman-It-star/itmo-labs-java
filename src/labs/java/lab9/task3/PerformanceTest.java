package labs.java.lab9.task3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PerformanceTest {
    public static List<Integer> fillList(List<Integer> list, int count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rnd.nextInt());
        }
        return list;
    }

    public static long measureRandomAccess(List<Integer> list, int operations) {
        Random rnd = new Random();
        int size = list.size();
        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            int idx = rnd.nextInt(size);
            list.get(idx);
        }
        return System.nanoTime() - start;
    }
}
