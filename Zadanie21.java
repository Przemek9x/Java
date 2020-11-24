package zadanie21;
import java.util.Scanner;

public class Zadanie21
{
    public static void main(String[] args)
    {
        double x, y, z;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Wprowadz liczbe x: ");
        x = keyboard.nextDouble();
        System.out.println("Wprowadz liczbe y: ");
        y = keyboard.nextDouble();
        
        if (x > 0)
        {
            if (y > 20)
            {
                z = 1;
                System.out.println(z);
            }
            
            else
            {
                z = 0;
                System.out.println(z);
            }
        }            
    }
    
}

