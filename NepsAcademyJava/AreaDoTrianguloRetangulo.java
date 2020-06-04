import java.util.Scanner;
public class AreaDoTrianguloRetangulo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int x, y; 
        x=leitor.nextInt(); 
        y =leitor.nextInt();

        System.out.println((x*y)/2);
     }
}