package zadanie31;
import java.util.Scanner;

public class Zadanie31
{
    public static void main(String[] args)
    {
        String selection;
        char answer;
        System.out.println("Wybierz jedą z liter od A do D.");
        Scanner keyboard = new Scanner(System.in);
        selection = keyboard.nextLine();
        answer = selection.charAt(0);
        
        
        switch (answer)
        {
            case 'A':
                System.out.println("Wybrałeś A");
                break;
            case 'B':
                System.out.println("Wybrałeś B");
                break;
            case 'C':
                System.out.println("Wybrałeś C");
                break;
            case 'D':
                System.out.println("Wbrałeś D");
                break;
            default:
                System.out.println("Nie radzisz sobie za dobrze z literami, co?");
                        
        }
    }
}

