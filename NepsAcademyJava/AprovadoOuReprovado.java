import java.util.Scanner;

public class AprovadoOuReprovado {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double nota = input.nextDouble();

        if(nota<4){
            System.out.println("Reprovado");
        }else if(nota >=4 && nota < 7){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Aprovado");
        }
    }
}
