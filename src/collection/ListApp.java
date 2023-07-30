package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        // List<String> strings = new LinkedList<>();

        strings.add("Dede");
        strings.add("Irwanto");

        strings.set(0, "Dedi");

        strings.remove(1);

        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
