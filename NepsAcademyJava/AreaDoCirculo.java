import java.util.Scanner;
public class AreaDoCirculo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double x; 
        x=leitor.nextDouble();

        double s = (3.1416*(x*x));
        System.out.printf("%.2f" , s);
     }
}