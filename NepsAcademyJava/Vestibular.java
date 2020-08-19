import java.util.*;

public class Vestibular
{
  static int acepted = 0;

	public static void main(String[] args)
  {
    	Scanner input = new Scanner(System.in);
      int quant = input.nextInt();
        String quest;
        quest = input.next();
        String gabarito;
        gabarito = input.next();

        for (int i = 0; i < gabarito.length(); i++)
        {
          if (quest.charAt(i) == gabarito.charAt(i))
          {
            acepted++;
          }
        }

        System.out.println(acepted);
        
    }
}