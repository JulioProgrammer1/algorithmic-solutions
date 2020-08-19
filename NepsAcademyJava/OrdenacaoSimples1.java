import java.util.*;


public class OrdenacaoSimples1
{
  public static void main(String[] args)
  {
    Scanner ler = new Scanner(System.in);

    int maior, inutil; maior = 0; inutil = 0;
  
    int vet[] = new int[10];

    for(int i=0; i < vet.length; i++)
    {
      vet[i] = ler.nextInt();
    }
    Arrays.sort(vet);
    for( int num : vet)
    {
      System.out.print(num + " ");
    }
     System.out.println("");
    
      for(int i = vet.length -1; i >= 0; i--)
      {
        System.out.print(vet[i] + " ");
      }
 
    }
      }
    

