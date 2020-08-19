import java.util.Scanner;

public class Xadrez{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
      int lado,coluna; lado =ler.nextInt(); coluna =ler.nextInt();
      if(lado%2==0&&coluna%2==0){
        System.out.println("1");
      } else if(lado%2!=0&&coluna%2!=0){
        System.out.println("1");
      }else{
        System.out.println("0");
       }
      }
    }
 