package zadanie78;
import java.util.Scanner;
import java.io.*;


public class Zadanie78
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter file = new PrintWriter("Droga.txt");
        Scanner input = new Scanner(System.in);
        int hour, droga, speed;
        
        System.out.println("Podaj ilosc godzin w podrozy");
        hour = input.nextInt();
        System.out.println("Podaj predkosc");
        speed = input.nextInt();
        
        if (hour < 1 || speed <= 0)
            System.out.println("PODAJ WLASCIWE WARTOSCI");
        else
        {
            file.println("Godzina\t\t\tPrzebyta odleglosc");
            file.println("------------------------------------------------");
            for (int i = 1; i <= hour; i ++)
            {
                droga = i * speed;
                file.printf("%d\t\t\t\t%d\n",i,droga);
            }
        }
        file.close();
    }

}

