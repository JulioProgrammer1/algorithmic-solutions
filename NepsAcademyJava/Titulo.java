import java.util.Scanner;

public class Titulo {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                String frase = in.nextLine();
                String letras[] = new String[frase.length() + 1];

                letras[0] = " ";

                for ( int i = 1; i <= frase.length(); i++ ) {
                        letras[i] = "" + frase.charAt(i-1);
                }
                for ( int i = 1; i <= frase.length(); i++ ) {
                        if ( letras[i-1].equals(" ") ) {
                                System.out.print(letras[i].toUpperCase());
                        }
                        else {
                                if ( letras[i] .equals(letras[i].toUpperCase()) ) {
                                        System.out.print(letras[i].toLowerCase());
                                }
                                else {
                                        System.out.print(letras[i]);
                                }
                        }
                }
                System.out.println();
        }
}