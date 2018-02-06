package onlineQuiz;
import java.util.Scanner;
/*
A software used for decomposition.
 */

public class decomposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the number : ");
        int a = in.nextInt();
        decompose(a);
    }

    private static void decompose(int a) {
        System.out.print(a + "=");
        if (a == 1 || a == 2) {
            System.out.print(a);
        }
        else {
            for (int i = 2; i <= a ; i++) {
                while ((a % i) == 0 && a != i) {
                System.out.print(i + "*");
                a = a / i ;
                }
                if (a == i) {
                    System.out.println(i);
                    break ;
                }
            }
        }
    }
}

