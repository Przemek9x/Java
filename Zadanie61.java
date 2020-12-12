package zadanie61;
import java.io.*;
import java.util.Scanner;

public class Zadanie61
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Podaj nazwe pliku");
        String filename = keyboard.nextLine();
        
        File file = new File(filename);
        
        Scanner inputFile = new Scanner(file);
        
        String line = inputFile.nextLine();
        System.out.println("Pierwszy wiersz tego pliku to: ");
        System.out.println(line);
        
        inputFile.close();
        
    }
}
