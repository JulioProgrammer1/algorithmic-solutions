import java.util.Scanner;

public class TempoDeViagemEmSegundos {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
      int d1,h1,m1; d1 =ler.nextInt(); h1 = ler.nextInt(); m1 = ler.nextInt();
      int seg1 = (d1*86400)+(h1*3600)+(m1*60);
      int d2,h2,m2; d2 =ler.nextInt(); h2 = ler.nextInt(); m2 = ler.nextInt();
      int seg2 = (d2*86400)+(h2*3600)+(m2*60);
      int tempo = seg2-seg1;
      System.out.println(tempo);
      }
    }
 