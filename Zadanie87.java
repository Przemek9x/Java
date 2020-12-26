package zadanie87;
import java.util.Scanner;

public class Zadanie87
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj długość boku");
        int bok = keyboard.nextInt();
        
        for (int i = 0; i < bok; i++)
        {
            for (int y = 0; y < bok; y++)
            {
                System.out.print("X");
            }
        System.out.println("");
        }        
    }
}