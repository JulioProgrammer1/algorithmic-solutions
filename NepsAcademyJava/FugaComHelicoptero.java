import java.util.Scanner;

public class FugaComHelicoptero {

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    int H, P, F, D;
    H=teclado.nextInt();
    P=teclado.nextInt();
    F=teclado.nextInt();
    D=teclado.nextInt();

    if(H < P && F < P  && H < F && D < 0){
        System.out.println("S");
    }else if(H < P && F > P && H < F && D < 0){
        System.out.println("N");
    }else if(H < P && F < P && H < F && D > 0){
        System.out.println("N");
    }else if(H < P && F > P && H < F && D > 0){
        System.out.println("S");
    }else if(H > P && F > P && H < F && D < 0){
        System.out.println("S");
    }else if(H < P && F < P && H > F && D < 0){
        System.out.println("N");
    }else if(H > P && F > P && H < F && D > 0){
        System.out.println("N");
    }else if(H < P && F < P && H > F && D > 0){
        System.out.println("S");
    }else if(H > P && F < P && H > F && D < 0){
        System.out.println("S");
    }else if(H > P && F > P && H > F && D < 0){
        System.out.println("N");
    }else if(H > P && F < P && H > F && D > 0){
        System.out.println("N");
    }else if(H > P && F > P && H > F && D > 0){
        System.out.println("S");
    }
  }
}
