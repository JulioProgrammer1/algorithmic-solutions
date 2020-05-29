import java.util.Scanner;

public class Fatoreal {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);

        int numero, cont, teste1, teste2;
        numero = input.nextInt();
	cont =1;
        teste1 = 1; teste2 = 2;
        int fator =0;

        if(numero == 0|| numero ==1){
            System.out.println("1");
        }
        else{
            while(cont<numero){
                fator = teste1*teste2;
                teste1 = fator;
                teste2 = teste2+1;
                cont++;
            }
            System.out.println(fator);
        }
    }
}
