import java.util.Scanner;
public class MaiorEntre3Numeros {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int x, y, z;
        x = leitor.nextInt(); y = leitor.nextInt();
    z = leitor.nextInt();
        if(x>=y&&x>=z){
            System.out.println(x);
    }else if(y>=x&&y>=z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}