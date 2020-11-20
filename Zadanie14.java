package zadanie14;
import java.util.Scanner;

public class Zadanie14
{
    public static void main(String[] args)
    {
        double man, woman, suma, odsetek_w, odsetek_m;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Podaj liczbe kobiet na kursie: ");
        woman = keyboard.nextInt();
 
        System.out.print("Podaj liczbę mężczyzn na kursie: ");
        man = keyboard.nextInt();
        
        suma = man + woman;
        odsetek_w = (woman / suma) * 100;
        odsetek_m = (man / suma) * 100;
        
        
        System.out.println("Kobiety stanowią " + odsetek_w + " procent uczestników kursu, a meżczyźni " 
                + odsetek_m + " procent.");            
    }
} 