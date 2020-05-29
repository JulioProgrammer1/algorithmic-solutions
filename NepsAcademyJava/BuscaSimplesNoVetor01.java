import java.util.Scanner;

public class BuscaSimplesNoVetor01 {

    public static void main(String[] args){
   	Scanner t = new Scanner(System.in);
    	int n[] = new int[10];

    	for (int i = 0; i < 10; i++){
        	n[i] = t.nextInt();
    	}

  	int nteste = t.nextInt();
  	boolean teste = false;

   	for (int i = 0; i < 10; i++){

	        if(nteste == n[i]){
     			teste = true;
     		}
    	}

    	if (teste) {
      		System.out.println("SIM");
	}
	else{
      		System.out.println("NAO");
    	}
    }
}
