package zadanie77;
import java.util.Scanner;

public class Zadanie77
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hour, droga, speed;
        
        System.out.println("Podaj ilość godzin w podróży");
        hour = input.nextInt();
        System.out.println("Podaj prędkość");
        speed = input.nextInt();
        
        if (hour < 1 || speed <= 0)
            System.out.println("PODAJ WŁAŚCIWE WARTOŚCI");
        else
        {
            System.out.println("Godzina\t\t\tPrzebyta odległość");
            System.out.println("------------------------------------------------");
            for (int i = 1; i <= hour; i ++)
            {
                droga = i * speed;
                System.out.printf("%d\t\t\t\t%d\n",i,droga);
            }
        }
    }

}
