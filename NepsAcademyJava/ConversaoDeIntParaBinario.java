import java.util.Scanner;

public class ConversaoDeIntParaBinario {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int base = 2;
	int expoente = 30;
        int numero, mod;
        numero = input.nextInt();
        mod =0;
        String nada = "";

        if(numero == 0 ){
            System.out.println("0");
        }
	else {
        	for(; numero > 0 ;){
            		mod = (numero%2);
            		nada = mod + nada;
            		numero = (numero/2);
        	}
        	if(numero <=  Math.pow(base, expoente) && numero >= 0){
            		System.out.println(nada);
        	}
       	 }
    }
}
