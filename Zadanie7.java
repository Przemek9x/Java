package zadanie7;
import java.util.Scanner;

public class Zadanie7
{
    public static void main(String[] args)
    {
        double cena, stanowy, lokalny, cena_total;
        
        Scanner value = new Scanner(System.in);
        System.out.print("Wprowadź wartość produktu: ");
        cena = value.nextDouble();
        
        stanowy = 0.02;
        lokalny = 0.04;
        cena_total = (stanowy * cena) + (lokalny * cena) + cena;
        
        System.out.println("Kwota całkowita wynosi " + cena_total); 
    }
}
