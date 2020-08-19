import java.util.Scanner;

class Game10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int posicoes = input.nextInt();
        int disco = input.nextInt();
        int aviao = input.nextInt();

        int cont = 0;

        while ( true ) {

            if ( aviao == disco ) {
              break;
            }
            if ( aviao == posicoes ) {
              aviao = 0;
            }

            aviao++;
            cont++;
        }
        System.out.println(cont);
    }
}