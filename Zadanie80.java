package zadanie80;
import java.util.Scanner;

public class Zadanie80
{
    public static void main(String[] args)
    {
        int pokojeZ, pokojeWs, liczbaPi;
        double obl, sumaZ = 0, sumaW = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe pięter");
        liczbaPi = keyboard.nextInt();
        
        for (int i = 0; i <= liczbaPi; i++)
        {
            System.out.printf("Podaj liczbe wszystkich pokoi na piętrze %d\n", i);
            pokojeWs = keyboard.nextInt();
            sumaW += pokojeWs;
            System.out.printf("Podaj liczbe zajętych pokoi na piętrze %d\n", i);
            pokojeZ = keyboard.nextInt();
            sumaZ += pokojeZ;
            
            
        }
        obl = (sumaZ/sumaW);        
        System.out.printf("Wszystkie pokoje: %.1f\nZajete pokoje: %.1f\nOblozenie: %.2f", sumaW, sumaZ, obl );
    }
}