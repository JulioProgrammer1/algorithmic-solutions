import java.util.Scanner;
public class DezValores{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        for(int i=0; i<10; i++){
            int soma = x+1;
            x=soma;
            System.out.print(soma+" ");
        }
    }
}
