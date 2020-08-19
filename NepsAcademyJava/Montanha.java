import java.util.Scanner;

public class Montanha {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int quantidade = in.nextInt();
                int vetor[] = new int[quantidade+2];
                int picos = 0;

                for ( int i = 1; i <= quantidade; i++ ) {
                        vetor[i] = in.nextInt();
                }
                for ( int i = 1; i <= quantidade; i++ ) {
                        if ( vetor[i] > vetor[i-1] && vetor[i] > vetor[i+1] ) {
                                picos++;
                        }
                }
                if ( picos >= 2 ) {
                        System.out.println("S");
                }
                else {
                        System.out.println("N");
                }
        }
}
