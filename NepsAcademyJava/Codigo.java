import java.util.*;

public class Codigo
{
  static int cem = 0;

	public static void main(String[] args)
  {
    	Scanner input = new Scanner(System.in);
        int quant;
        quant = input.nextInt();
        
        int binarios[] = new int[quant];

        for (int i = 0; i < binarios.length; i++)
        {
          binarios[i] = input.nextInt();
        }
        for (int i = 0; i < binarios.length-2; i++)
        {
          if (binarios[i] == 1 && binarios[i+1] == 0 &&binarios[i+2] == 0 )
          {
            cem++;
          }
        }
        System.out.println(cem);
    }
}