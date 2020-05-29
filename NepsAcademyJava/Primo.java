import java.util.Scanner;

public class Primo {

  public static void main(String[] args) {
    Scanner t = new Scanner(System.in);

    int numero, divisores; 
    numero = t.nextInt();
    divisores = 0;

    for ( int cont = 1; cont<=numero; cont++){
      if(numero%cont == 0){
      divisores++;
      }
    }
    if(divisores==2){
      System.out.println("S");
    }
    else{
      System.out.println("N");
    }
  }
}
  //
