import java.util.Scanner;

public class SomaDoVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int parametros = input.nextInt();
        int n[] = new int[parametros];

        for(int i = 0; i < n.length; i++ ) {
           n[i] = input.nextInt();
        }
        int soma = 0;
        for(int i = 0; i < n.length; i++ ) {
            soma = soma + n[i];
        }
        System.out.println(soma);
    }
}

