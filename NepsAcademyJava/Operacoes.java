import java.util.Scanner;
public class Operacoes
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        char escolha = ler.next().charAt(0);
        
        double n1, n2; n1 = ler.nextDouble(); n2 = ler.nextDouble();
        
        if(escolha == 'M')
        {
            System.out.printf("%.2f" , n1*n2);
        }else if(escolha == 'D')
            System.out.printf("%.2f" , n1/n2);
        {
        }
    }
}
            