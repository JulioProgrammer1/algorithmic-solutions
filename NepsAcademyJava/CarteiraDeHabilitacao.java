import java.util.Scanner;

public class CarteiraDeHabilitacao {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int atual = input.nextInt();
    int nascimento = input.nextInt();

    System.out.println(atual-nascimento);
    if ( (atual-nascimento) >= 18 ) {
      System.out.println("Pode tirar carteira\n" + ( (atual-nascimento) - 18) );
    }
    else {
      System.out.println("Nao pode tirar carteira\n" + (18 - (atual-nascimento) ) );
    }
  }
}