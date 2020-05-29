import java.util.Scanner;

public class Bondinho {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a, m;
	a = input.nextInt();
        m = input.nextInt();
        
        int todos = a+m;
        
        if(todos <= 50){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
