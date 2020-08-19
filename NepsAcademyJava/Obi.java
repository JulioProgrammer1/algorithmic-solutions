import java.util.Scanner;
class Obi{
  public static void main(String[] args) {
    Scanner JG = new Scanner(System.in);

    int numeroc, pn, soma, aprovados, cont;

    numeroc = JG.nextInt(); pn = JG.nextInt();
    soma = 0; aprovados = 0; cont = 0;

    while(cont<numeroc){
      int fase1 = JG.nextInt(); int fase2 = JG.nextInt();
      soma = fase1+fase2;
      if(soma>=pn){
        aprovados++;
      }
      cont++;
    }
    System.out.println(aprovados);
  }
}