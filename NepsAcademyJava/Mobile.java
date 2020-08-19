import java.util.Scanner;
public class Mobile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
 int a,b,c,d; a=in.nextInt();b=in.nextInt();c=in.nextInt();d=in.nextInt();
        
        if(a ==(b+c+d) && d == (b+c) && b == c)
        {
            System.out.print('S');
        }else
            {
                System.out.print('N');
            }
          }
        }
         
         
        