import java.util.*;

public class Senha2018
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int contSenha = 0;

    while(true){
    
      String tentativa = input.next();

      if(tentativa.equals("2018"))
      {
        break;
      }
      contSenha++;
    }
    System.out.print(contSenha);
  }
}