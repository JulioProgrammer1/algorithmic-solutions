import java.util.Scanner;
public class ParOuImpar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int p, d1, d2;
        
        p = input.nextInt(); 
        d1 = input.nextInt();
        d2 = input.nextInt();
        
        int dd = (d1+d2) % 2;
       
        if(p == 0 && dd == 0){
            System.out.println("0");
        }else if( p == 1 && dd == 0){
            System.out.println("1");
        }else if(p == 0 && dd != 0){
             System.out.println("1");
        }else if( p == 1 && dd != 0){
            System.out.println("0");
        }
    }
}