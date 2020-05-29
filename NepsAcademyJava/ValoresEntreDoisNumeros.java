import java.util.Scanner;

public class ValoresEntreDoisNumeros {

    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int a, b;
        a = t.nextInt(); 
	b = t.nextInt();

        if(a<=b){
        	for(;a<=b; a++){
            		System.out.print(" " + a);
        	}
        }

        else if(b<=a){
        	for(; b<=a; b++){
            		System.out.print(" " + b);
          	}
        }
    }
}

