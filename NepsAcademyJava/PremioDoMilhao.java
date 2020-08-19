import java.util.*;

public class PremioDoMilhao
{
  static int milhao = 0;
  static int contador = 0;
  static int soma = 0;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int quantidade = input.nextInt();
    int lista[] = new int[quantidade];
    int i = 0;
    while(i < lista.length)
    {
      lista[i] = input.nextInt();
      contador++;
      milhao+=lista[i];
      if(milhao >= 1000000 && soma == 0)
      {
        soma = contador;
      }
      i++;
    }
    System.out.println(soma);
  }
}