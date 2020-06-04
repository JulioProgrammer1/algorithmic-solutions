import java.util.Scanner;
public class Quadrante{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int x,y; 
        x=t.nextInt(); 
        y=t.nextInt();
        
        if(x>0&&y>0){
            System.out.println("Q1");
        }else if(x<0&&y>0){
            System.out.println("Q2");
        }else if(x<0&&y<0){
            System.out.println("Q3");
        }else if(x>0&&y<0){
            System.out.println("Q4");
        }else{
            System.out.println("eixos");
        }

    }
}