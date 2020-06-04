import java.util.Scanner;
public class PositivoNegativoNulo{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int x; 
        x=t.nextInt();

        if(x>0){
            System.out.println("positivo");
        }else if(x<0){
            System.out.println("negativo");
        }else{
            System.out.println("nulo");
        }
    }
}