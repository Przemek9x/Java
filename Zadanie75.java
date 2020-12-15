package zadanie75;
import java.io.*;

public class Zadanie75
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter file = new PrintWriter("NumberList.txt");
        
        for (int i = 0; i <= 100; i++)
            file.print(" " + i + " ");
        file.close();
            
            
    }
}

