package zadanie9.pkg9;
import java.util.Scanner;


public class Zadanie9
{
    public static void main(String[] args)
    {
        int wynik1, wynik2, wynik3;
        double srednia;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Podaj wynik pierwszego testu: ");
        wynik1 = keyboard.nextInt();
        
        System.out.println("Podaj wynik drugiego testu: ");
        wynik2 = keyboard.nextInt();
        
        System.out.println("Podaj wynik trzeciego testu: ");
        wynik3 = keyboard.nextInt();
        
        srednia = ((wynik1 + wynik2 + wynik3) / 3);
        System.out.println("Twój wynik to " + srednia);
    }
}

