import java.util.Scanner;

public class Consecutivos {

        public static void main (String[] args) {
                Scanner input = new Scanner(System.in);

                int quantidade = input.nextInt();

                int contador = 1;
                int antes = 0;
                int maior = 0;

                for ( int i = 0; i < quantidade; i++ ) {

                        int numero = input.nextInt();

                        if ( numero == antes ) {
                                contador++;
                        }
                        if ( contador > maior ) {
                                maior = contador;
                        }
                        if ( numero != antes ) {
                                contador = 1;
                        }
                        antes = numero;
                }
                System.out.println(maior);
        }
}
