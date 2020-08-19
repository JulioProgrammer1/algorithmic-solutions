import java.util.*;


public class Cadscore
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int atual, sequencia, cont;
        atual = in.nextInt();
        sequencia = in.nextInt();
        cont = 0;
        
        do {
            int numeros = in.nextInt();
            atual = atual + numeros;
            
            if(atual > 100)
            {
                atual = 100;
            }
            else if(atual < 0)
            {
                atual = 0;
            }
            cont++;
         } while(cont<sequencia);
        
        System.out.println(atual);
    }
}