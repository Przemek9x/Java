package zadanie11;
import java.util.Scanner;


public class Zadanie11
{
    public static void main(String[] args)
    {
        String miasto, duze, male;
        char pierwsza;
        int length; 
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj nazwę ulubionego miasta: ");
        miasto = keyboard.nextLine();
        
        length = miasto.length();
        duze = miasto.toUpperCase();
        male = miasto.toLowerCase();
        pierwsza = miasto.charAt(0);
        
        System.out.println(length);
        System.out.println(duze);
        System.out.println(male);
        System.out.println(pierwsza);           
    }
}


