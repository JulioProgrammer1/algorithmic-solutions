import java.util.Scanner;

public class Impedido {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int l, r, d;
        l = input.nextInt();
        r = input.nextInt();
        d = input.nextInt();

        if ( (r > 50) && (l < r) && (r > d) ) {
            System.out.println("S");
        }
	else{
            System.out.println("N");
        }
    }
}
