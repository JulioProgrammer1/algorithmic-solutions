import java.util.Scanner;

public class SomaDosElementos {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);

        int soma, novo; soma = 0; novo = 0;

        int quantidade; quantidade = t.nextInt();
        int n;

        for(int i = 0 ; i < quantidade; i++){

        n = t.nextInt();
        soma = soma + n;


        }
        System.out.println(soma);
    }
}
