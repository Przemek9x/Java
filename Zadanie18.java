// In this program I am practicing my "If-else-if" statement
package zadanie18;
import java.util.Scanner;

public class Zadanie18
{
    public static void main(String[] args)
    {
        int x,y;
        x = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        y = keyboard.nextInt();
        if (y == 20)
            x = 0;
        System.out.println(x);
        
        double hours, payRate, payment;
        payment = 4000;
        payRate = 1;
        System.out.println("Podaj liczbę godzin");
        hours = keyboard.nextDouble();
        if (hours > 40)
            payRate = 1.5;
        System.out.println(payment*payRate);
        
        double commission, sales;
        commission = 0;
        System.out.println("Podaj liczbę sprzedaży");
        sales = keyboard.nextDouble();
        if (sales >= 10000)
            commission = 0.2;
        System.out.println(commission);
            
        
    }
}
