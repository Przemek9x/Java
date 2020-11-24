// In this program I am practicing else statement
package zadanie19;
import java.util.Scanner;

public class Zadanie19
{
    public static void main(String[] args)
    {
        double x,y;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        x = keyboard.nextDouble();
        
        if (x > 100)
            y = 20;
        else 
            y = 0;
                    
        System.out.println(y);
                
        double x1,y1;
        System.out.println("Podaj liczbę");
        y1 = keyboard.nextDouble();
        if (y1 == 100)
            x = 1;
        else
            x = 0;
        System.out.println(x);
        
        double commission, sales;
        System.out.println("Podaj liczbę");
        sales = keyboard.nextDouble();
        commission = 0.1;
        if (sales >= 50000.0)
            commission = 0.2;
        System.out.println(commission);
        
        double a, b, c;
        System.out.println("Podaj liczbę");
        a = keyboard.nextDouble();
        if (a < 10)
        {
            b = 0;
            c = 1;
        }
        else 
        {
            b = -99;
            c = 0;         
        }
        System.out.println(b + " " + c);
  
    }
}