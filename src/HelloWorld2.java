import java.util.Scanner ;
public class HelloWorld2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print("Please, your name:");
        String name = in.next () ;
        System.out.println ("Hello, my dear " + name + ".");
    }
}
