import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoDe3Numeros{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int vet[] = new int[3];

        for(int i=0; i<vet.length; i++){
          vet[i] = t.nextInt();
        }

        Arrays.sort(vet);
        //for it
        for( int ordem : vet){
          System.out.println(ordem);
        }


    }
}