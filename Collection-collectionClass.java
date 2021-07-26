import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        for(int i=1;i<15;i++) {
            list.add(i);
        }
        System.out.println("Max : "+Collections.max(list));
        System.out.println("Min : "+Collections.min(list));
        System.out.println("Frequency of 1 : "+Collections.frequency(list, 1));
        System.out.println("Index of 2 using binary search : "+Collections.binarySearch(list, 2));
        System.out.println("Before sorting : "+list);
        Collections.sort(list);
        System.out.println("After sorting : "+list);
    }
}