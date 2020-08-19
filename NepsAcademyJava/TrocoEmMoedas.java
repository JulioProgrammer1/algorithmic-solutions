import java.util.*;

public class TrocoEmMoedas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int notas[] = {100, 50, 25, 10, 5, 1};
    int usadas[] = new int[notas.length];
    int soma = 0;

		int valor = -1;
		int qn;

    valor = input.nextInt();

		for (int i = 0; i < notas.length; i++) {
			qn = valor / notas[i];
			valor = valor % notas[i];
			usadas[i] = qn;
      soma += usadas[i];
			qn = 0;
		}
    System.out.println(soma);

    for ( int i = 0; i < notas.length; i++) {
      System.out.println(usadas[i]);
    }
	}
}