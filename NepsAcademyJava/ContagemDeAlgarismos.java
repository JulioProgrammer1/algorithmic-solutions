import java.util.*;

public class ContagemDeAlgarismos
{
  static int resultado  = 0;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
    zero = 0; um = 0; dois = 0; tres = 0;
    quatro = 0; cinco = 0; seis = 0; sete = 0; oito = 0; nove = 0;

    int quantidade = input.nextInt();

    for(int i = 0; i < quantidade; i++)
    {
      int n = input.nextInt();
      String nstring = ""+n;

      for(int j=0;j<nstring.length();j++)
      {
        if(nstring.charAt(j) == '0'){
          zero++;
        }
        //
        if(nstring.charAt(j) == '1'){
          um++;
        }
        //
        if(nstring.charAt(j) == '2'){
          dois++;
        }
        //
        if(nstring.charAt(j) == '3'){
          tres++;
        }
        //
        if(nstring.charAt(j) == '4'){
          quatro++;
        }
        //
        if(nstring.charAt(j) == '5'){
          cinco++;
        }
        //
        if(nstring.charAt(j) == '6'){
          seis++;
        }
        //
        if(nstring.charAt(j) == '7'){
          sete++;
        }
        //
        if(nstring.charAt(j) == '8'){
          oito++;
        }
        //
        if(nstring.charAt(j) == '9'){
          nove++;
        }
      }
    }
        System.out.println("0 - " + zero);
        System.out.println("1 - " + um);
        System.out.println("2 - " + dois);
        System.out.println("3 - " + tres);
        System.out.println("4 - " +quatro);
        System.out.println("5 - " + cinco);
        System.out.println("6 - " + seis);
        System.out.println("7 - " + sete);
        System.out.println("8 - " + oito);
        System.out.println("9 - " + nove);
  }
}