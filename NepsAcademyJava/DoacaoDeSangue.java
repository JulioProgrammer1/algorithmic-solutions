import java.util.Scanner;

public class DoacaoDeSangue {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int atual = input.nextInt();
    int nascimento = input.nextInt();

    System.out.println(atual-nascimento);
    if ( (atual-nascimento) >= 18 && (atual-nascimento) <= 67  ) {
      System.out.println("Pode doar sangue");
    }
    else {
      System.out.println("Nao pode doar sangue");
    }
  }
}