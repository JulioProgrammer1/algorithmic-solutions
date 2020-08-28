import java.util.Scanner;

public class ValorAbsoluto {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    if ( n >= 0 ) {
      System.out.println(n);
    }
    else {
      System.out.println(n * -1);
    }
  }
}