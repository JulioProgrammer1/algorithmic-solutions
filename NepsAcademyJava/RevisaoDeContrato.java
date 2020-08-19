import java.util.*;

public class RevisaoDeContrato {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		while(true) {
			
			String tecla = input.next();
			String contrato = input.next();
			
			if (tecla.equals("0") && contrato.equals("0")) {
				break;
			}

			contrato = contrato.replaceAll(tecla, "");

			if (contrato.isEmpty()) {
				System.out.println(0);
			}

			boolean ezero = false;
			for (int i = 0; i < contrato.length(); i++) {
				if (contrato.charAt(i) == '0') {
					ezero = true;
				} else {
					ezero = false;
					break;
				}
			}
			if (ezero == true) {
				System.out.println("0");
			} else {
				System.out.println(contrato);
			}
		}
	}
}