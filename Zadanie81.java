package zadanie81;
import java.util.Scanner;

public class Zadanie81
{
    public static void main(String[] args)
    {
        int lata, cent, sumaCent = 0, mies = 0;
        double av = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe lat");
        lata = keyboard.nextInt();
        mies = lata * 12;
        
        if (lata <= 1)
        {
            System.out.println("Podaj liczbe wieksza niż 1");
            lata = keyboard.nextInt();
        }
        else
            for (int i = 1; i <= lata; i++)
            {
                for (int y = 1; y <= 12; y++)
                {
                    System.out.println("Podaj liczbę opadów w " + y + " miesiącu");
                    cent = keyboard.nextInt();
                    sumaCent += cent;
                }
            }
        av = sumaCent/(lata*12);
        System.out.printf("Liczba miesięcy: %d\nLiczba opadów: %d\nŚredni opad: %.1f", mies, sumaCent, av);
    }
}