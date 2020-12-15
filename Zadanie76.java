package zadanie76;
import javax.swing.JOptionPane;

public class Zadanie76
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Podaj dodatnią niezerową liczbe całkowitą");
        int liczba = Integer.parseInt(input), suma = 0;
        
        
        for (int i = 1; i <= liczba; i++)
            suma += i;
        
        JOptionPane.showMessageDialog(null, "Suma liczb wynosi: " + suma);
        System.exit(0);
            
    }
}