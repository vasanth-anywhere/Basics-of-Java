import java.util.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<25;i++) {
            list.add(i);
        }
        System.out.println("Before editing : "+list);
        List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("Even List : "+evenList);
        long evenCount = list.stream().filter(i -> i%2==0).count();
        System.out.println("Even List Count : "+evenCount);
        List<Integer> incrementedList = list.stream().map(i -> i+5).collect(Collectors.toList());
        System.out.println("List elements after incremented by 5 : "+incrementedList);
        List<Integer> descendingOrder = list.stream().sorted((i1,i2) -> ((i1<i2)?1:((i1>i2)?-1:0))).collect(Collectors.toList());
        System.out.println("Descending order List : "+descendingOrder);
    }
}