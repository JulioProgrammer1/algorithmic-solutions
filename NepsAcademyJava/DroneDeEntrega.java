import java.util.Scanner;

class Main{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, c, h, l;

    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    h = input.nextInt();
    l = input.nextInt();

    if (a<=h&&b<=l||a<=l&&b<=h||a<=l&&c<=h||b<=h&&c<=l||c<=h&&b<=l||a<=h&&c<=l) {
      System.out.println('S');
    }else{
      System.out.println('N');
    }
  }
}