//Q3: Use rangeclosed to create a stream
import java.util.*;
import java.util.stream.IntStream;
class Question3
{
    public static void main(String[] args) {
        IntStream stream= IntStream.rangeClosed(-5, 5);
        stream.forEach(System.out::println);
    }
}