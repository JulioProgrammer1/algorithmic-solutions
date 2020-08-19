import java.util.Scanner;
class TiraTeima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        
        if ( x >= 0 && x <= 432 && y >= 0 && y <= 468){
            System.out.println("dentro");
        }else{
            System.out.println("fora");
        }
    }
}