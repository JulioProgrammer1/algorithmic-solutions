import java.util.Scanner;


public class Telefone
  {
    public static void main(String[] args)
    {
      Scanner ler = new Scanner(System.in);

      String letra = ler.nextLine();

     if(letra.length() <= 15)
     {
       for(int i =0; i < letra.length(); i++)
       {
         if(letra.charAt(i) == '0'||letra.charAt(i) == '1'||letra.charAt(i) == '2'
         ||letra.charAt(i) == '3'||letra.charAt(i) == '4'||letra.charAt(i) == '5'||letra.charAt(i) == '6'
         ||letra.charAt(i) == '7'||letra.charAt(i) == '8'||letra.charAt(i) == '9')
         {
           System.out.print(letra.charAt(i));
         }else if(letra.charAt(i) == '-')
         {
           System.out.print('-');
         }

         if(letra.charAt(i) == 'A' || letra.charAt(i) == 'B' || letra.charAt(i) == 'C'){
           System.out.print('2');
         }

         if(letra.charAt(i) == 'D' || letra.charAt(i) == 'E' || letra.charAt(i) == 'F')
         {
          System.out.print('3');
         }
         if(letra.charAt(i) == 'G' ||letra.charAt(i) == 'H' ||letra.charAt(i) == 'I')
         {
           System.out.print('4');
         }
         if(letra.charAt(i) == 'J' || letra.charAt(i) == 'K' || letra.charAt(i) == 'L')
         {
           System.out.print('5');
         }
         if(letra.charAt(i) == 'M' || letra.charAt(i) == 'N' || letra.charAt(i) == 'O')
         {
           System.out.print('6');
         }
         if(letra.charAt(i) == 'P' || letra.charAt(i) == 'Q' || letra.charAt(i) == 'R' || letra.charAt(i) == 'S')
         {
           System.out.print('7');
         }
         if (letra.charAt(i) == 'T' || letra.charAt(i) == 'U' || letra.charAt(i) == 'V')
         {
           System.out.print('8');
         }
         if(letra.charAt(i) == 'W' || letra.charAt(i) == 'X' || letra.charAt(i) == 'Y' || letra.charAt(i) == 'Z')
         {
           System.out.println('9');
         }

       }
        
      } 
    }}
