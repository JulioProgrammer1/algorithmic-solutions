import java.util.Scanner;
public class ZeroOuUm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c;
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if (a != b && b == c) {

            System.out.println("A");
        }
        else if ( b != a && a == c) {

            System.out.println("B");
        } 
        else if ( c != a && a == b ) {
        
            System.out.println("C");
        }
        else if ( a == b && b == c) 
        {
            System.out.println("*");
        }
    }
}
            
            
        
        