import java.util.Scanner;

class SomaDasDiagonaisDaMatriz3X3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[9];

        for ( int i = 0; i < lista.length; i++ ) {
          lista[i] = leitor.nextInt();
        }

        System.out.println("Diagonal principal: " + (lista[0] + lista[4] + lista[8]));
        System.out.println("Diagonal secundaria: " + (lista[2] + lista[4] + lista[6]));
    }
}