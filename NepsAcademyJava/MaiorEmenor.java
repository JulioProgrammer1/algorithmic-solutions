import java.util.Scanner;

public class MaiorEmenor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
      int nq = ler.nextInt(); int maior, menor;
      maior =1; menor = 999999;int x;
      for(int i=0; i<nq;i++){
        x =ler.nextInt();
      
      if(x<menor){
        menor = x;
      }
      if(x>maior){
        maior = x;
      }
    }
      System.out.print(maior+"\n"+menor);

  }
}
