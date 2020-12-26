package zadanie88;
import java.util.Scanner;
import java.util.Random;

public class Zadanie88
{
    public static void main(String[] args)
    {
        int komp, user, pktKomp = 0, pktUser= 0;
        Random randomNumber = new Random();
        
        for (int i = 0; i <= 10; i++)
        {
            komp = randomNumber.nextInt(6)+1;
            user = randomNumber.nextInt(6)+1;
            
            if (komp > user)
            {
                System.out.println("Punkt dla komputera");
                pktKomp ++;
            }
            else if (komp < user)
            {
                System.out.println("Punkt dla użytkownika");
                pktUser ++;
            }
            else 
                System.out.println("Remis");
                
        }
        if (pktKomp > pktUser)
            System.out.println("Wygrał Komputer!");
        else if (pktKomp < pktUser)
            System.out.println("Wygrał Użytkownik!");
        else
            System.out.print("Remis!");
        
    }
}
