import java.util.Scanner;

public class Raizes  {

      public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        double cont, n, nq;
        cont =0;
	n=0;
        nq = input.nextInt();

        while(cont<= nq){
           n = input.nextDouble();
           System.out.printf("%.4f" , Math.sqrt(n));
           System.out.println("");
           cont++;
       }
   }
}
