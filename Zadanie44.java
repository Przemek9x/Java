package zadanie44;
import javax.swing.JOptionPane;

public class Zadanie44
{
    public static void main(String[] args)
    {
        int cena = 99, pakiety;
        double suma = 0;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj liczbę zakupionych pakietów.");
        pakiety = Integer.parseInt(str);
        
        
        if (pakiety < 10)
            JOptionPane.showMessageDialog(null, "Minimalna ilość pakietów to 10.");
        else if (pakiety >= 10 && pakiety <= 19)
        {
            suma = (pakiety * cena) - 0.2*(pakiety*cena);
            JOptionPane.showMessageDialog(null, String.format("Cena pakietów wynosi %.1f złotych", suma));
        }
        else if (pakiety >= 20 && pakiety <= 49)
        {
            suma = (pakiety * cena) - 0.3*(pakiety*cena);
            JOptionPane.showMessageDialog(null, String.format("Cena pakietów wynosi %.1f złotych", suma));
        }
        else if (pakiety >= 50 && pakiety <= 99)
        {
           suma = (pakiety * cena) - 0.4*(pakiety*cena);
           JOptionPane.showMessageDialog(null, String.format("Cena pakietów wynosi %.1f złotych", suma)); 
        }
        else 
           suma = (pakiety * cena) - 0.5*(pakiety*cena);
           JOptionPane.showMessageDialog(null, String.format("Cena pakietów wynosi %.1f złotych", suma)); 
    }
    
}
        