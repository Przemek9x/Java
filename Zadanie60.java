package zadanie60;
import java.util.Scanner;
import java.io.*;


public class Zadanie60
{
    public static void main(String[] args)throws IOException
    {
        String filename, friendName;
        int friendNumber;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę znajomych");
        friendNumber = keyboard.nextInt();
        
        keyboard.nextLine();
        
        System.out.print("Podaj nazwę pliku.");
        filename = keyboard.nextLine();
        
        PrintWriter outputFile = new PrintWriter(filename);
        
        for (int i = 1; i <= friendNumber; i++)
        {
            System.out.println("Podaj imię znajomego");
            friendName = keyboard.nextLine();
            
            outputFile.println(friendName);
        }
        outputFile.close();
        System.out.println("Dane zostały zapisane");
                
           
        
    }
}
