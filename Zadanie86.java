package zadanie86;
import java.io.*;
import java.util.Scanner;

public class Zadanie86
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String filename = keyboard.nextLine();
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        System.out.println("Wiersze tego pliku to: ");
        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            System.out.println(line);
        }
        inputFile.close();
    }
}