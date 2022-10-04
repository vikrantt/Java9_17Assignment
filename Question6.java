//Q6:Convert an optional type into stream
import java.util.*;
public class Question6
{
    public static void main(String[] args) {
        Optional<Integer> op= Optional.of(2000);
        System.out.println("Optional type:"+op);
        System.out.println("Getting the stream:");
        op.stream().forEach(System.out::println);
    }
}