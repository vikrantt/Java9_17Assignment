//Q4: Use iterator stream method to generate a stream
import java.util.*;
import java.util.stream.*;
public class Question4
{
    public static <T> Stream <T>
    getStream(Iterator<T> iterator)
    {
        Spliterator<T> spliterator= Spliterators.spliteratorUnknownSize(iterator, 0);
        return StreamSupport.stream(spliterator, false);
    }
    public static void main(String[] args) {
        Iterator<Integer>
        iterator= Arrays.asList(1,2,3,4,5).iterator();
        Stream<Integer> stream= getStream(iterator);
        stream.forEach(s-> System.out.println(s));
    }
}