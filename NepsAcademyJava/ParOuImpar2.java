import java.util.Scanner;
public class ParOuImpar2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int x, y;
        x = leitor.nextInt(); y = leitor.nextInt();
        if((x+y)%2==0){
            System.out.println("Bino");
        }else{
            System.out.println("Cino");
        }
    }
}