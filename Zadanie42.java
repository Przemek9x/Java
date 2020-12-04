package zadanie42;
import javax.swing.JOptionPane;

public class Zadanie42
{
    public static void main(String[] args)
    {
        double masa, ciezar;
        String str;
        str = JOptionPane.showInputDialog(("Podaj masę obiektu w kg."));
        masa = Double.parseDouble(str);
        
       ciezar = masa * 9.8;
       
       if (ciezar > 1000)
           JOptionPane.showMessageDialog(null, "Cięzar jest za duży");
       else if (ciezar < 10)
           JOptionPane.showMessageDialog(null, "Ciezar jest za mały.");
       else 
           JOptionPane.showMessageDialog(null, String.format("Cięzar wynosi %.1f", ciezar));
       
       
       
        
    }
}
        