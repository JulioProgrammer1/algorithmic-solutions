import java.util.Scanner;

public class ClassificacaoDeTriangulo {

  static boolean serOuNaoSer ( int a, int b, int c ) {
    if ( a < (b+c) && b < (a+c) && c < (a+b) ) {
      return true;
    }
    return false;
  }

  static void classificacao ( int a, int b, int c ) {
	if ( (a == b && b != c) || (c == a && a != b) || (b == c && c != a) ) {
		System.out.println("1");
	}
	else if ( a != b && b != c && a != c ) {
		System.out.println("2");
	}
	else {
		System.out.println("3");
	}
  }

  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);

    int a,b,c;

    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    if ( !serOuNaoSer(a,b,c) ) {
		System.out.println("N");
    }
    else {
		System.out.println("S");
		classificacao(a, b, c);
    }

  }
}