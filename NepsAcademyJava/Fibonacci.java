import java.util.Scanner;

public class Fibonacci {

        static boolean[] calculei = new boolean[100];
        static long[] salvei = new long[100];

        static long fib( int n) {

                if ( calculei[n] ) {
                        return salvei[n];
                }

                calculei[n] = true;

                if ( n == 0 || n == 1 ) {
                        salvei[n] = 1;
                }
                else {
                        salvei[n] = fib(n-1) + fib(n-2);
                }

                return salvei[n];
        }

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                
                int numero = in.nextInt();

                System.out.println( fib(numero) );
        }
}