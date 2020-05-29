import java.util.Scanner;

public class DoisVetoresParesEimpares {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int vet[] = new int[10];

   for(int i =0; i < vet.length; i++){
     vet[i] = input.nextInt();
   }

   int cont1 = 0;

// while(){

   for(int i =0; i < vet.length; i++){
     if(vet[i]%2==0){
       System.out.print(vet[i] + " ");
     }
   }
   System.out.println("");

   int cont =0;
   while(cont<vet.length){
     if(vet[cont]%2 != 0){
       System.out.print(vet[cont] + " ");
     }
     cont++;
   }
  }
}


