import java.util.Scanner;

public class MediaInteiraPonderada {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a,b; a = ler.nextInt(); b = ler.nextInt();

    int sp = 4+6;
    int divpond =((a*4) + (b*6))/sp;

    System.out.println(divpond);


  }
}