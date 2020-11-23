package zadanie17;
import java.util.Scanner;

public class Zadanie17
{
    public static void main(String[] args)
    {
        int ciastka;
        double maka, cukier, maslo, proporcje;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ile ciastek chcesz zjeœæ?");
        ciastka = keyboard.nextInt();
        
        proporcje = 48 / ciastka;
        maka = 2.75 * proporcje;
        cukier = 1.5 * proporcje;
        maslo = 1 * proporcje;
        
        System.out.print(maka + " " + cukier + " " + maslo);
      
    }
}

