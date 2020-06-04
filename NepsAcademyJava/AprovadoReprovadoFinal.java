import java.util.Scanner;
public class AprovadoReprovadoFinal{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int x,y; 
        x=t.nextInt(); 
        y=t.nextInt();

        double media = (x*2+y*3)/5;

        if(media>=7){
            System.out.println("Aprovado");
        }else if(media<3){
            System.out.println("Reprovado");
        }else{
            System.out.println("Final");
        }
    }
}