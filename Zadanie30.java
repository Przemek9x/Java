package zadanie30;
import java.util.Scanner;

public class Zadanie30
{
    public static void main(String[] args)
    {
        int userNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Wpisz jedną z liczb " +
                         "1,2 lub 3: ");
        userNum = keyboard.nextInt();
        
        switch (userNum)
        {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("BŁĄD, PODAJ WŁASCIWY NUMER");
                break;
                       
                
        }
    }
    
}

