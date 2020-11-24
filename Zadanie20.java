package zadanie20;
import java.util.Scanner;

public class Zadanie20
{
    public static void main(String[] args)
    {
        double amount1, amount2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadz liczbe nr 1: ");
        amount1 = keyboard.nextDouble();
        System.out.println("Wprowadz liczbe nr 2: ");
        amount2 = keyboard.nextDouble();
        if (amount1 > 10)
        {
            if (amount2 < 100)
            {
                if (amount1 > amount2)
                    System.out.println(amount1);
                else
                    System.out.println(amount2);
            }
        }
    }
}
