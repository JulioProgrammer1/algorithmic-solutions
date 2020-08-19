import java.util.*;

public class Lampadas
{
    public static void main(String[]args)
    { 
        int apagada, acesa; apagada = 0;acesa = 1;
        Scanner in = new Scanner(System.in);
        //seq 
        int n = in.nextInt();
        int a,b;
        a = 0; // apagada
        b = 0; // apagada
        
        for(int i =0;i < n;i++)
        {
             //interruptor
            int inter =in.nextInt();
            
            if(inter == 1 && a ==0)
            {
                a = acesa;
            }
            else if(inter == 1 && a == 1)
            {
              a = apagada;
            }
             if(inter == 2 && a == 0)
            {
              a = acesa;
            }
            else if(inter == 2 && a == 1)
            {
              a = apagada;
            }
            if(inter == 2 && b == 0)
            {
              b = acesa;
            }
            else if(inter == 2 && b == 1)
            {
              b = apagada;
            }
        }
        System.out.print(a +"\n"+b);
  
      }}