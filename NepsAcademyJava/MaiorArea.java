import java.util.Scanner;
class MaiorArea {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int L1 = tec.nextInt();int A1 = tec.nextInt();
        int L2 = tec.nextInt();int A2 = tec.nextInt();
        
        if (L1 * A1 > L2 * A2){
            System.out.println("Primeiro");
        }else if ( L1 * A1 < L2 * A2){
            System.out.println("Segundo");
        }else if ( L1 * A1 == L2 * A2){
            System.out.println("Empate");
        }
    }
}