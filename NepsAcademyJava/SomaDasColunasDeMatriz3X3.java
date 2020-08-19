import java.util.Scanner;

class SomaDasColunasDeMatriz3X3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lista[] = new int[9];

        for ( int i = 0; i < lista.length; i++ ) {
          lista[i] = leitor.nextInt();
        }

        System.out.println("Coluna 0: " + (lista[0] + lista[3] + lista[6]));
        System.out.println("Coluna 1: " + (lista[1] + lista[4] + lista[7]));
        System.out.println("Coluna 2: " + (lista[2] + lista[5] + lista[8]));
    }
}