import java.util.Scanner;

public class Medalhas {

	//Muito tempo atrás

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
	int t1,t2,t3;
        t1 = t.nextInt(); t2 = t.nextInt(); t3 = t.nextInt();

        if(t1<t2&&t1<t3&&t2<t3){
            System.out.println("1\n2\n3");
        }if(t1<t2&&t1<t3&&t3<t2){
            System.out.println("1\n3\n2");
        }if(t2<t1&&t2<t3&&t1<t3){
            System.out.println("2\n1\n3");
        }if(t2<t1&&t2<t3&&t3<t1){
          System.out.println("2\n3\n1");
        }if(t3<t2&&t3<t1&&t2<t1){
          System.out.println("3\n2\n1");
        }if(t3<t1&&t3<t2&&t1<t2){
          System.out.println("3\n1\n2");
        }
    }
}
