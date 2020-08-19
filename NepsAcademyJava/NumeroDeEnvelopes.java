import java.util.Scanner;
public class NumeroDeEnvelopes{
public static void main(String[] args) {
  Scanner t = new Scanner(System.in);
  int q = t.nextInt(); int cont, menor; menor = 999999; cont = 0;
  while(cont<q){
    int n = t.nextInt();
    if(n<menor){
      menor =n;
    }cont++;
  }
  System.out.println(menor);
 }
}