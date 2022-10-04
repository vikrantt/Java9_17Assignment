//Q2: Perform takewhile and dropwhile operations on stream
import java.util.*;
public class Question2
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        Set<Integer> set= Set.of(10,20,30,40,50);
        System.out.println("Performing takewhile:");
        list.stream()
        .takeWhile(e-> e%2!=0)
        .forEach(System.out::println);

        System.out.println("using dropwhile:");
        set.stream()
        .dropWhile(e-> e%2!=0)
        .forEach(e-> System.out.println(e));

    }
}