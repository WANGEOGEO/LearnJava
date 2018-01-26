package onlineQuiz;
/*
Find all the Armstrong numbers between 100 and 900.
 */
public class armstrongNum {
    public static void main (String[] args) {
        int m = 100 ;
        int n = 999 ;
        for (int i = m ; i <= n ; i ++) {
            if (isArm(i)) {
                System.out.print(i + " ");
            }

        }

    }
    private static boolean isArm (int a) {
        int x = a/100 ;
        int y = (a-(x*100))/10 ;
        int z = a - 100 * x - 10 * y ;
        if (a == x*x*x + y*y*y + z*z*z) {
            return true ;
        }
        else {
            return false ;
        }
    }
}
