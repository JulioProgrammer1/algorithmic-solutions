import java.util.Scanner;

public class MaiorOuMenorDeIdade {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int atual = input.nextInt();
    int nascimento = input.nextInt();

    System.out.println(atual-nascimento);
    if ( (atual-nascimento) >= 18 ) {
      System.out.println("Maior");
    }
    else {
      System.out.println("Menor");
    }
  }
}