import java.util.*;

public class OverFlow
{
  static int resultado  = 0;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int quantidade = input.nextInt();

    int n1 = input.nextInt();
    String sinal = input.next();
    int n2 = input.nextInt();

    if(sinal.equals("+"))
    {
      resultado = n1+n2;
    }
    else
    {
      resultado = n1*n2;
    }
    if(resultado > quantidade)
    {
      System.out.println("OVERFLOW");
    }
    else
    {
      System.out.println("OK");
    }

  }
}