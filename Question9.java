//Q9: Create Unmodifialble List from a Stream
import java.util.*;
import java. util.stream.Collectors;
import java.util.stream.Stream;
class Question9
{
    public static void main(String[] args) {
        var unmodList= Stream.of(1,2,3,4,5)
        .collect(Collectors.collectingAndThen(Collectors.toList(),
         Collections::unmodifiableList));
         System.out.println(unmodList);
    }
}
