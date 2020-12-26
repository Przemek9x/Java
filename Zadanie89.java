package zadanie89;
import java.util.Scanner;
import java.util.Random;

public class Zadanie89
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj kwote pieniedzy wrzuconej do maszyny");
        int kwota = keyboard.nextInt(), wyplata = 0;
        String word = " ";
        Random obrazek = new Random();
        String word1 = "", word2 = "", word3= "";
        
        
        for (int i = 1; i <= 3; i++ )
        {
            int los = obrazek.nextInt(5);
            
            if (los == 0)
            {
                word = "Pomarańcze";
                System.out.println("Pomarańcze");
            }
            else if (los == 1)
            {
                word = "Wiśnie";
                System.out.println("Wiśnie");
            }
            else if (los == 2)
            {
                word = "Śliwki";
                System.out.println("Śliwki");
            }
            else if (los == 3)
            {
                word = "Dzwonki";
                System.out.println("Dzwonki");
            }
            else if (los == 4)
            {
                word = "Melony";
                System.out.println("Melony");
            }
            else 
            {
                word = "Bary";
                System.out.println("Bary");
            }  
        switch (i)
        {
            case 1:
                word1 = word;
                break;
            case 2:
                word2 = word;
                break;
            default:
                word3 = word;
                break;
                
        }
            
        }  
        if (!(word1.equals(word2)) && !(word2.equals(word3)) && !(word1.equals(word3))) // 0 takich samych
        {
            wyplata = 0;
            System.out.println("Wygrałeś " + wyplata + "zl.");
        }
        else if ((word1.equals(word2)) && !(word2.equals(word3)) && !(word1.equals(word3))) // 1 jak 2
        {
            wyplata = 2 * kwota;
            System.out.println("Wygrałeś " + wyplata + "zl.");
        }
        else if (!(word1.equals(word2)) && (word2.equals(word3)) && !(word1.equals(word3))) // 2 jak 3
        {
            wyplata = 2 * kwota;
            System.out.println("Wygrałeś " + wyplata + "zl.");
        }
        else
        {
            wyplata = 3 * kwota;
            System.out.println("Wygrałeś " + wyplata + "zl.");      
    }
    }
}
    

