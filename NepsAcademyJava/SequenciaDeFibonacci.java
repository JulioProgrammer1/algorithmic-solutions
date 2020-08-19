import java.util.Scanner;

public class SequenciaDeFibonacci {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int maximo = in.nextInt();
                int n1, n2, valor;
                n1 = 1; n2 = 0; valor = 0;

                if ( maximo == 1 ) {
                        System.out.println(n2);
                }
                else if ( maximo == 2 ) {
                        System.out.print(n2 + " " + n1 + "\n");
                }

                else {

                        System.out.print(n2 + " " + n1);

                        for ( int i = 0; i < maximo-2; i++ ) {
                                valor = n1 + n2;
                                n2 = n1;
                                n1 = valor;
                                System.out.print(" " + valor);
                        }
                System.out.println();
                }
        }
}