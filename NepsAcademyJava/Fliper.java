import java.util.Scanner;
public class Fliper{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int p, b;
        p = input.nextInt();
        b = input.nextInt();
        
        if(p == 0){
            System.out.println("C");
        } else if( p == 1 && b == 1){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}