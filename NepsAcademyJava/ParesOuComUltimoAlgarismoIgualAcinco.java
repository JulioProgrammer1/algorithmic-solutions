import java.util.*;

public class ParesOuComUltimoAlgarismoIgualAcinco {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String cx, cy, cz;
    String sx, sy, sz;
    int x, y, z;
    int quantidade; quantidade = 0;

    x = input.nextInt();
    y = input.nextInt();
    z = input.nextInt();

    sx = "" + x; sy = "" + y; sz = "" + z;
    cx = "" + sx.charAt(sx.length()-1);
    cy = "" + sy.charAt(sy.length()-1);
    cz = "" + sz.charAt(sz.length()-1);

    if(x % 2 == 0 || cx.equals("5")) {
      quantidade++;
    }
    if(y % 2 == 0 || cy.equals("5")) {
      quantidade++;
    }
    if(z % 2 == 0 || cz.equals("5")) {
      quantidade++;
    }
    System.out.println(quantidade);
  }
}