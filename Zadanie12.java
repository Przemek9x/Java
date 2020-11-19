package zadanie12;
import java.util.Scanner;

public class Zadanie12
{
    public static void main(String[] args)
    {
        double kwota,cena, tax = 0.0675 , tip = 0.2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Podaj cene posiłku: ");
        cena = keyboard.nextDouble();
        kwota = cena + (cena * tax) + (cena * tip);
        
        System.out.println("Łączna cena posiłku to: " + kwota);
        System.out.println("Podatek wynosi: " + cena*tax);
        System.out.println("Napiwek wynosi: " + cena*tip);
       
    }
}