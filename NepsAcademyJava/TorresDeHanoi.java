import java.util.*;

class TorresDeHanoi {
  static long ndisco = -1;
  static int movi = 1;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (ndisco != 0) {

      int ndisco = input.nextInt();

      if (ndisco == 0) {
        break;
      } else {
        double cont = Math.pow(2, ndisco);
        int i2 = (int) cont;

        System.out.println("Teste " + movi);
        System.out.println(i2 - 1);
      }
      movi++;
    }
  }
}
