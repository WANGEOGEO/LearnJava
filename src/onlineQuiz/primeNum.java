package onlineQuiz;
/*
Find out how many prime numbers there is between 101 and 200, then list them.

 */
public class primeNum {
    public static void main (String[] args) {
        int beg = 101 ;
        int las = 200 ;
        int count = 0 ;
        for (int n = beg ; n <= las ; n++ ) {
            if (isPrime(n)) {
                count++ ;
                System.out.print(n+" ");

            }

        }
        System.out.println();
        System.out.println("There're totally "+count+" prime numbers between 101 and 200");
    }
    private static boolean isPrime(int a) {
        boolean pri = true;
        if (a==1) {
            pri = false ;
        }
        else {
            for (int i = 2 ; i <= Math.sqrt(a) ; i++ ) {
                if (a % i == 0) {
                    pri = false ;
                    break ;
                }
                else {
                    pri = true ;
                }
            }
        }
        return pri ;
    }
}
