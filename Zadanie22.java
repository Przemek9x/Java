package zadanie22;
import java.util.Scanner;

public class Zadanie22
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double speed;
        
        System.out.print("Podaj liczbę: ");
        speed = keyboard.nextDouble();
                
        if (speed > 0 && speed < 200)
            System.out.println("Liczba jest poprawna.");
        else
            System.out.println("Liczba jest błędna.");
            
    }
}
