import java.util.Scanner;

public class Inverso {

  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int vet[] = new int[10];

      for(int i =0; i<vet.length; i++){
          vet[i] = input.nextInt();
      }
      for(int i =9; i>=0; i--){
          System.out.println(vet[i]);
      }
   }
}

