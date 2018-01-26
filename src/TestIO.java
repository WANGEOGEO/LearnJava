/*
referenced from ANU COMP1110 homework
 */
import java.util.Scanner;
public class TestIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        int a = in.nextInt();
        System.out.print("Enter string b: ");
        String b = in.next();
        System.out.println("a: " + a + ", b: "+ b);
    }
}
