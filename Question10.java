//Q10: Demonstrate the use of repeat, strip, isBlank,
// indent, transform, stripIndent, translateEscapes,
// formatted String methods.
public class Question10
{
    public static void main(String[] args) {
        String a= "repeat";
        System.out.println("Our repeated string:"+a.repeat(3));

        String str= "      hello world    !    ";
        System.out.println(str.strip());

        String b= "hello";
        System.out.println(b.isBlank());

        String c= "Hello";
        System.out.println(c.indent(5));

        System.out.println("   blank spaces  ".stripIndent());

        System.out.println("1. %s  2. %s  3. %s ".formatted("one","two","three"));

        String d= "This is a tab \t, and now new line \n, now backspace \b, now single quotes \'";
        System.out.println(d.translateEscapes());

        String text= "tothenew.com";
        String result= text.transform(t -> {if(text.contains(".com"))
            {return "A .com domain";}

            else {return "not a .com domain";}
        });

        System.out.println("result:>"+result);
    }
}