package zadanie27;
import javax.swing.JOptionPane;

public class Zadanie27
{
    public static void main(String[] args)
    {
        double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Podaj x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Podaj y"));
        z = (x>y) ? 1: 20;
        
        JOptionPane.showMessageDialog(null, "Z wynosi: " + z);
    }
} 