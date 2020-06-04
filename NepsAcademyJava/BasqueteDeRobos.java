import java.util.Scanner;

class BasqueteDeRobos{

    public static void main(String args[]){

        Scanner x = new Scanner (System.in);

        int D = x.nextInt();

        if ( D >= 0 && D <= 800 ){
            System.out.println('1');
        }
        else if ( D >= 800 && D <= 1400){
            System.out.println('2');
        }
        else if ( D >= 1400 && D <= 2000){
            System.out.println('3');
        }
    }
        }