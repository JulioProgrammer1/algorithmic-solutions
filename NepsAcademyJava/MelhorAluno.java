import java.util.Scanner;
class MelhorAluno {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);

        double A = tec.nextDouble();
        double B = tec.nextDouble();
        
        if ( A <= B){
            System.out.println("Pedro");
        }
        if ( B < A){
            System.out.println("Paulo");
        
        }
    }
}