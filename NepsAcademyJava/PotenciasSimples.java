import java.util.Scanner;

public class PotenciasSimples
         {
    public static void main(String[] args)
    {
    Scanner t = new Scanner(System.in);

        double pot, base; base = t.nextDouble(); pot = t.nextDouble();

        System.out.printf("%.4f" , Math.pow(base, pot) );
    
    }
}