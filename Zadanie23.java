package zadanie23;
import javax.swing.JOptionPane;

public class Zadanie23
{
    public static void main(String[] args)
    {
        String input1, input2;
        
        input1 = JOptionPane.showInputDialog("Podaj imię.");
        input2 = JOptionPane.showInputDialog("Podaj drugie imię.");
        
        if (input1.equals(input2))
            JOptionPane.showMessageDialog(null, "Imiona są identyczne.");
        else
            JOptionPane.showMessageDialog(null, "Imiona są różne.");
            
                
        
                
    }
}
