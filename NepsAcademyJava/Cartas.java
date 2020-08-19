import java.util.Scanner;

public class Cartas {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a,b,c; a = ler.nextInt(); b = ler.nextInt(); c = ler.nextInt();
    if(a == b){
      System.out.print(c);
    }else if(a == c){
      System.out.print(b);
    }else{
      System.out.print(a);
    }

  }
}