import java.util.Scanner;

public class CobraCoral1 {

        public static void main ( String[] args ) {
                Scanner input = new Scanner(System.in);

                int n1, n2, n3, n4;
                n1 = input.nextInt();
                n2 = input.nextInt();
                n3 = input.nextInt();
                n4 = input.nextInt();

                if ( ( (n1 == n3) && (n2 != n4) ) || ( (n2 == n4) && (n1 != n3) ) ) {
                        System.out.println("V");
                }
                else {
                        System.out.println("F");
                }
        }
}

