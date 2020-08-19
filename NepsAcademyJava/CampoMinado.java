import java.util.Scanner;

public class CampoMinado {

        static void campo() {
                Scanner input = new Scanner(System.in);

                int n = input.nextInt();
                int vetor[] = new int[n+2];
                int valor = 0;

                vetor[0] = 0; 
                vetor[n+1] = 0;

                for ( int  i = 1; i <= n; i++ ) {
                        vetor[i] = input.nextInt();
                }

                for ( int i = 1; i <= n; i++ ) {
                        System.out.println(vetor[i-1]+vetor[i]+vetor[i+1]);
                }
        }

        public static void main(String[] args) {
                campo();
        }
}