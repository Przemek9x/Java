package zadanie68;
import java.util.Scanner;

public class Zadanie68
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure;
        
        System.out.println("Czy chcesz zakonczyc prace?");
        input = keyboard.nextLine();
        sure = input.charAt(0);
        int count = 0;
        
        while (sure == 'T' || sure == 't' && count <= 0)
        {
            count++;
            System.out.println("Kończenie pracy");
        }
        
      
    }
}

