import java.util.*;

public class Garcom
{
  static int soma = 0;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int quantidade = input.nextInt();

    for(int i = 0; i < quantidade; i++)
    {
      int latas = input.nextInt();
      int copos = input.nextInt();

      if(latas > copos)
      {
        soma += copos;
      }
    }
  System.out.println(soma);
  }
}