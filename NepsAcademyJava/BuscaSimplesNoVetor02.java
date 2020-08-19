import java.util.*;

class BuscaSimplesNoVetor02 {
        public static void  main(String[] args) {
          Scanner input = new Scanner(System.in);

                int lista[] = new int[10];

                for ( int i = 0; i < lista.length; i++) {
                        lista[i] = input.nextInt();
                }

                int numero = input.nextInt();
                int cont = 0;
                int miax = 0;

                for ( int i = 0; i < 10; i++) {
                        if ( lista[i] == numero ) {
                                cont++;
                        }
                        else {
                          miax++;
                        }
                }

                if ( miax == 10 ) {
                        System.out.println("Mia x");
                }
                else {
                        System.out.println(cont);

                        for ( int i = 0; i < 10; i++) {
                                if ( lista[i] == numero ) {
                                        System.out.print(i + " ");
                                }
                        }
                        System.out.println();
                }
        }     
}

