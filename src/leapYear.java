import java.util.Scanner;
public class leapYear {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Please input the year");
        int a = in.nextInt();
        if ((a % 100 != 0 && a % 4 == 0) || (a % 400 == 0)) {
            System.out.println(a + " is leap year.");
        }
        else {
            System.out.println(a + " is not leap year.");
        }
        in.close();
    }
}
