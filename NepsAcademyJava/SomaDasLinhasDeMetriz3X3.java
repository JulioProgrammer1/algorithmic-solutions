import java.util.Scanner;

class SomaDasLinhasDeMatriz3X3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[9];

        for ( int i = 0; i < lista.length; i++ ) {
          lista[i] = leitor.nextInt();
        }

        System.out.println("Linha 0: " + (lista[0] + lista[1] + lista[2]));
        System.out.println("Linha 1: " + (lista[3] + lista[4] + lista[5]));
        System.out.println("Linha 2: " + (lista[6] + lista[7] + lista[8]));
    }
}