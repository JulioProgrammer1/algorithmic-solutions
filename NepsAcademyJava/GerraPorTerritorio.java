import java.util.*;

public class GerraPorTerritorio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec = input.nextInt();
        int medidas[] = new int[sec];
        int metade = 0;
        int conf = 0;

        for (int i = 0; i < sec; i++) {
            medidas[i] = input.nextInt();
            metade += medidas[i];
        }
        for (int i = 0; i < sec; i++) {
            conf += medidas[i];
            if (conf == (metade / 2)) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}