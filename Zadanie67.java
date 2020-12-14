package zadanie67;
import java.util.Scanner;

public class Zadanie67
{
    public static void main(String[] args)
            {
                Scanner keyboard = new Scanner(System.in);
                double x;
                
                do 
                {
                    System.out.println("Podaj liczbę");
                    x = keyboard.nextDouble();
                }
                while (x > 0);
            }
}

