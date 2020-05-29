import java.util.Scanner;

public class FuncaoPrimo {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int num, cont, primo;
    num = input.nextInt();
    cont = 1;
    primo =0;

    while (cont <= num) {
      if (num%cont==0) {
        primo++;
      }
      cont++;
    }
    if (primo == 2) {
      System.out.println("S");
    }
    else {
      System.out.println("N");
    }
  }
}
