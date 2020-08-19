import java.util.*;
import javax.swing.JOptionPane;

public class SubstituicaoNoVetor
{
    public static void main(String[]args)
    { 
        Scanner in = new Scanner(System.in);

        int numeros[] = new int[10];

        for(int i =0; i<numeros.length; i++)
        {
          numeros[i] = in.nextInt();
        }
        
        int menor = 999999;

        for(int i =0; i < numeros.length; i++)
        {
          if(numeros[i] < menor)
          {
            menor = numeros[i];
          }
        }
        System.out.println("Menor: "+menor);
        System.out.print("Ocorrencias: ");

        for(int i =0; i<numeros.length; i++)
        {
          if(numeros[i] == menor)
          {
            System.out.print(i+" ");
          }
        }
        System.out.println();
        for(int i=0; i<numeros.length; i++)
        {
          if(numeros[i] == menor)
          {
            numeros[i] = -1;
          }
          System.out.print(numeros[i]+" ");
        }

        }
      }