import java.util.Scanner;

public class MinutosParaHorasEMinutos {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int m;
    m = ler.nextInt();
    int horascont;
    horascont = 0;
    for (; m >= 60;) {
      m = m - 60;
      horascont++;
    }
    System.out.println(horascont + "\n" + m);

  }
}