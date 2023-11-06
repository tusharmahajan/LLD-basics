package basics.staticVariables.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        integers.add(56);
        integers.add(12);
        integers.add(9);
        integers.add(1);

        DecreasingOrder comparator = new DecreasingOrder();
        Collections.sort(integers,comparator);

        System.out.println(integers);
    }
}
