package zadanie8;
import java.util.Scanner;

public class Zadanie8
{
    public static void main(String[] args)
    {
        int kilometers, liters;
        double usage;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Podaj liczę przejechanych kilometrów: ");
        kilometers = keyboard.nextInt();
        
        System.out.print("Podaj liczbę spalonego paliwa: ");
        liters = keyboard.nextInt();
        
        usage = kilometers / liters;
        System.out.println("W czasie podróży przejechałeś " + usage + " kilometrów na jednym litrze paliwa");
        
       
        
    }
}