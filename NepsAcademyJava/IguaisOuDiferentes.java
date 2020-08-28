import java.util.Scanner;

public class IguaisOuDiferentes {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int b = input.nextInt();

    if ( n == b ) {
      System.out.println("Iguais");
    }
    else {
      System.out.println("Diferentes");
    }
  }
}