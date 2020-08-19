import java.util.Scanner;

public class QuantasLetrasX
{
  public static void main(String[] args)
  {
    Scanner t = new Scanner(System.in);

    String nome;
   nome = t.next();
   char letra = t.next().charAt(0);
    
     int pontos;
      pontos = 0;

    for ( int i = 0; i< nome.length(); i++){
      if(nome.charAt(i) == letra){
        pontos++;
      }
      }
      System.out.println(pontos);
  }
}