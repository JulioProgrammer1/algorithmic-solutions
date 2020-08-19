import java.util.*;

public class MultiplosDeDoisTresEquatro {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int nums[] = new int[n];

    int m2, m3, m4;
    m2 = 0;
    m3 = 0;
    m4 = 0;

    for ( int i = 0; i < n; i++ ) {
      nums[i] = input.nextInt();

      if ( nums[i] % 2 == 0 ) {
        m2 ++;
      }
      if ( nums[i] % 3 == 0 ) {
        m3 ++;
      }
      if ( nums[i] % 4 == 0 ) {
        m4 ++;
      }
    }
    System.out.println(m2 + "\n" + m3 + "\n" + m4);
  }
}