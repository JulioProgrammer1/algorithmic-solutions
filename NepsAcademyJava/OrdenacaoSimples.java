import java.util.Scanner;
import java.util.Arrays;

public class OrdenacaoSimples{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int num; 
        num = t.nextInt();

        int vet[] = new int[num];

        for(int i=0; i<vet.length; i++){
          vet[i] = t.nextInt();
        }

        Arrays.sort(vet);
        //for it
        for( int ordem : vet){
          System.out.print(ordem + " ");
        }


    }
}
