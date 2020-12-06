package zadanie49;
import javax.swing.JOptionPane;

public class Zadanie49
{
    public static void main(String[] args)
    {
        double kwota, cena, minuty, min;
        char pakiet;
        String str;
        str = JOptionPane.showInputDialog("Podaj liczbę minut.");
        minuty = Double.parseDouble(str);    
        
               
                
        str = (JOptionPane.showInputDialog("Podaj pakiet z którego korzystasz.")).toUpperCase();
        pakiet = str.charAt(0);
        
        if (pakiet == 'A')
        {
            cena = 39.99;
            if (minuty >= 450)
                kwota = cena + 0.45 * (minuty - 450);
            else 
                kwota = cena;
            JOptionPane.showMessageDialog(null, String.format("Miesięczny rachunek wynosi %.2f zł.", kwota));    
        }
        else if (pakiet == 'B')
        {
            cena = 59.99;
            if (minuty >= 900)
                kwota = cena + 0.4 * (minuty - 900);
            else 
                kwota = cena;
            JOptionPane.showMessageDialog(null, String.format("Miesięczny rachunek wynosi %.2f zł.", kwota));    
        }
        else if (pakiet == 'D')
        {
            cena = 69.99; 
            JOptionPane.showMessageDialog(null, String.format("Miesięczny rachunek wynosi %.2f zł.", cena));    
        }
        else
            JOptionPane.showMessageDialog(null, "Podaj własciwy pakiet");
               
    }
}

