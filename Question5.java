import java.util.Optional;

//Q5: Use ifPresentOrElse, or, orElseThrow Operations with Optional
public class Question5
{
    public static void main(String[] args) {
        Optional<Integer> op= Optional.of(89);
        System.out.println("Optional"+op);

        op.ifPresentOrElse(
            (value)->{System.out.println("value is present:"+value);},
             ()->{System.out.println("Value is empty");});

        System.out.println("Value by orElseThrow("+"ArithmeticException::new) method"
        +op.orElseThrow(ArithmeticException::new));

        System.out.println("Optional by or(() ->"+op.or(()-> Optional.of(100)));
    }
}