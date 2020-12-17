package zadanie79;
import java.util.Scanner;

public class Zadanie79
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Podaj łańcuch znaków");
      String input = keyboard.nextLine();
      System.out.println("Podaj litere do znalezienia");
      String wyraz = keyboard.nextLine();
      char litera = wyraz.charAt(0);
      int wyst = 0;
      
      for (int i = 0; i < input.length()-1; i++)
      {
          if (input.charAt(i) == litera)
              wyst ++;
              
      }
     System.out.println(wyst);     
    }
    
}