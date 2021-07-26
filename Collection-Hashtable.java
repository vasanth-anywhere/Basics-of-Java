import java.util.*;
public class Main {

    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();
        table.putIfAbsent(1, "one");
        table.putIfAbsent(2, "two");
        table.putIfAbsent(3, "three");
        System.out.println(table);
        table.put(2, "TWO");
        table.putIfAbsent(3, "THREE");
        System.out.println(table.getOrDefault(1, "ONE"));
        System.out.println(table);
    }
}
