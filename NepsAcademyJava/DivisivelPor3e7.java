import java.util.Scanner;

public class DivisivelPor3e7 {

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    if ( n % 3 == 0 && n % 7 == 0) {
      System.out.println("Divisivel");
    }
    else {
      System.out.println("Nao divisivel");      
    }
  }
}