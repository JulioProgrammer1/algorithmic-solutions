import java.util.Scanner;
class SaldoDoVovo {
  public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
int dias, saldo, menor; dias = t.nextInt(); saldo = t.nextInt();
menor = saldo;
for(int saldod =1; saldod<=dias; saldod++){
  int saldo1 = t.nextInt();
  saldo = saldo + saldo1;
  if(saldo<menor){
    menor = saldo;

  }
}
System.out.println(menor);
  }
}