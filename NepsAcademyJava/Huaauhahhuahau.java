import java.util.*;
//Hauauau
class Huaauhahhuahau {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	String risadaRecep = input.next();
	String risada1, risada2;
	risada1 = ""; risada2 = "";

	for(int i = 0; i < risadaRecep.length(); i++) {
		if (risadaRecep.charAt(i) == 'a') {
		risada1 += risadaRecep.charAt(i);
		}
		else if (risadaRecep.charAt(i) == 'e') {
		risada1 +=risadaRecep.charAt(i);
		}
		else if (risadaRecep.charAt(i) == 'i') {
		risada1 += risadaRecep.charAt(i);
		}
		else if (risadaRecep.charAt(i) == 'o') {
		risada1 += risadaRecep.charAt(i);
		}
		else if(risadaRecep.charAt(i) == 'u') {
		risada1 += risadaRecep.charAt(i);
		}
	}
	for(int i = risada1.length()-1; i >= 0; i--) {
		risada2 += risada1.charAt(i);
	}
	if(risada1.equals(risada2)) {
	System.out.println("S");
	}
		else {
		System.out.println("N");
		}

	}
		}