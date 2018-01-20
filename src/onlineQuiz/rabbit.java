package onlineQuiz;
import java.util.Scanner;
/*
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
问每个月的兔子对数为多少？
 */
public class rabbit {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int a = in.nextInt();
        System.out.println("The result is: " + cal(a));
    }

    private static int cal(int a) {
        if (a == 1 || a == 2) {
            return 1 ;
        }
        else {
            return (cal(a - 1) + cal(a - 2));
        }
    }
}
