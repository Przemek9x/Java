package zadanie63;
import java.util.Scanner;

public class Zadanie63
{
    public static void main(String[] args)
    {
        double liczba1, liczba2;
        String answer;
        
        Scanner keyboard = new Scanner(System.in);
        do 
        {
            
            System.out.println("Podaj liczbę nr 1");
            liczba1 = keyboard.nextDouble(); 
            
            System.out.println("Podaj liczbę nr 2");
            liczba2 = keyboard.nextDouble();
            
            System.out.println("Suma wynosi " + (liczba1 + liczba2));
            System.out.println();
            System.out.println("Czy chcesz wykonać ponownie operacje?");
            answer = keyboard.next();
  
        }
        while (answer.equalsIgnoreCase("tak") == true);
                    
    }
}



