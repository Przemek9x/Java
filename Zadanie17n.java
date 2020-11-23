package zadanie17n;
import java.util.Scanner;

public class Zadanie17n
{
    public static void main(String[] args)
    {
        double score1, score2, score3, average;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ten program oblicza średnią wyników z trzech testów");
        
        System.out.println("Podaj wynik pierwszego testu: ");
        score1 = keyboard.nextDouble();
        
        System.out.println("Podaj wynik drugiego testu: ");
        score2 = keyboard.nextDouble();
        
        System.out.println("Podaj wynik trzeciego testu: ");
        score3 = keyboard.nextDouble();
        
        average = (score1 + score2 + score3)/ 3;
        System.out.println("Twoja średnia to: " + average);
        
        if (average > 90)
            System.out.println("To świetny wynik!");
                
    }
}


