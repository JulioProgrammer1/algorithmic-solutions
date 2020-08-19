import java.util.Scanner;

public class Postes {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int x, substituir, reforcar;
    substituir = 0;
    reforcar = 0;
    x = input.nextInt();
    int lista[] = new int[x];

    for ( int i = 0; i < lista.length; i++ ) {
      lista[i] = input.nextInt();

      if ( lista[i] < 50 ) {
        substituir++;
      }
      else if ( lista[i] >= 50 && lista[i] < 85 ) {
        reforcar++;
      }
    }
    System.out.println(substituir + " " + reforcar);
  }
}