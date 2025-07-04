package labs.java.lab9.task3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int ELEMENTS = 1_000_000;
        final int ACCESSES = 100_000; //1000- брал для примера и тогда LinkedList показывался

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        PerformanceTest.fillList(arrayList, ELEMENTS);
        long arrayTime = PerformanceTest.measureRandomAccess(arrayList, ACCESSES);
        System.out.println("ArrayList random access time: " + arrayTime + " ns");

        // LinkedList
        //LinkedList.get(i) — линейная операция O(n) → при большом n
        // и большом числе запросов превращается в «почти бесконечность».
        List<Integer> linkedList = new LinkedList<>();
        PerformanceTest.fillList(linkedList, ELEMENTS);
        long linkedTime = PerformanceTest.measureRandomAccess(linkedList, ACCESSES);
        System.out.println("LinkedList random access time: " + linkedTime + " ns");

        System.out.println(
                "Note: ArrayList быстрее при доступе по индексу, LinkedList медленнее из-за прохода по узлам.");
    }
}
