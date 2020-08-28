import java.util.Scanner;

public class QuadradoOuRetangulo {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();

    System.out.println((a+b)*2);
    if ( a == b ) {
      System.out.println("Quadrado");
    }
    else {
      System.out.println("Retangulo");
    }
  }
}