import java.util.Scanner;
public class HorasEMinutosParaMinutos{
  public static void main(String[] args){
Scanner ler = new Scanner(System.in);
int h,m;
h = ler.nextInt(); m =ler.nextInt();
int horas = h*60;
int tempo =horas+m;
System.out.println(tempo);
  }
}