package zadanie70;
import java.util.Scanner;

public class Zadanie70
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("podaj liczbe z zakresu 1-4");
        int number = keyboard.nextInt();
        
        while (!(number >= 1 && number<=4))
        {
            System.out.println("Podaj własciwe dane");
            number = keyboard.nextInt();
        }
    
    }
}
