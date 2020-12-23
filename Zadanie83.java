package zadanie83;
import javax.swing.JOptionPane;

public class Zadanie83
{
    public static void main(String[] args)
    {
        String str = JOptionPane.showInputDialog("Podaj liczbę do ciągu lub -99 zeby zakonczyc");
        int liczba = Integer.parseInt(str);
        int low, high;
        
        while (liczba != -99)
        {
            str = JOptionPane.showInputDialog("Podaj liczbę do ciągu lub -99 zeby zakonczyc");
            liczba = Integer.parseInt(str);
            System.out.println("Wprowadzona liczba: " + liczba);
        }
    }
}