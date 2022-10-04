//Q1:Demonstrate the use of private methods in interfaces
interface PrivateMethod{
   public abstract void mult(int a,int b);

   public default void add(int a,int b)
   {
        sub(a,b);
        div(a,b);
        System.out.println("Using default method in interface");
        System.out.println("Addition of a and b:>"+(a+b));
   }

   //Using private methods in interface
   private void sub(int a,int b)
   {
    System.out.println("Substraction of a and b using private method:>"+(a-b));
   }

   private static void div(int a,int b)
   {
    System.out.println("Division of a and b using private static method:>"+(a/b));
   }
}

public class Question1 implements PrivateMethod{
    /* (non-Javadoc)
     * @see PrivateMethod#mult(int, int)
     */
    public void mult(int a,int b)
    {
        System.out.println("Multiplication of a and b using abstract method:>"+(a*b));
    }
    public static void main(String[] args) {
        PrivateMethod obj= new Question1();
        obj.mult(4, 5);
        obj.add(20,5);
    }
}