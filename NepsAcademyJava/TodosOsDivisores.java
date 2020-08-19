import java.util.Scanner;
class TodosOsDivisores{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int contador = 1;
        while(contador <= x){
          int divisao = x % contador;
            if(divisao == 0){
                System.out.print(contador + " ");
               }
              contador = contador + 1;
            
        }
        
    }
} 