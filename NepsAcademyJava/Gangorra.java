import java.util.Scanner;

public class Gangorra {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int p1,c1,p2,c2;
                p1 = in.nextInt(); c1 = in.nextInt();
                p2 = in.nextInt(); c2 = in.nextInt();

                int esquerdo, direito;
                esquerdo = p1 * c1; direito = p2*c2;

                if ( esquerdo == direito ) {
                        System.out.println("0");
                }
                else if ( esquerdo > direito ) {
                        System.out.println("-1");
                }
                else {
                        System.out.println("1");
                }
        }
}
