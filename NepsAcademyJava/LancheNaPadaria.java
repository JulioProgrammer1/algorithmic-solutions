import java.util.Scanner;

public class LancheNaPadaria {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int valor = input.nextInt();

    if ( valor <= 5 ) {
      System.out.println("SIM");
    }
    else {
      System.out.println("NAO");
    }
  }
}