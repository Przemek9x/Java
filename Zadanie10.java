package zadanie10;
import java.util.Scanner;


public class Zadanie10
{
    public static void main(String[] args)
    {
        double zysk, cena;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cene produktu: ");
        cena = keyboard.nextDouble();
        
        zysk = cena * 0.4;
        System.out.println("Zysk wynosi " + zysk + " złotych.0");
               
    }
}
        