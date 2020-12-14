package zadanie65;
import javax.swing.JOptionPane;

public class Zadanie65
{
    public static void main(String[] args)
    {
        double counter = 0, value;
        String input;
        
        input = JOptionPane.showInputDialog("Podaj wartość");
        value = Double.parseDouble(input);
        
        for (int i = 1; i <=10; i++)
            counter += value;
        
        JOptionPane.showMessageDialog(null, counter);
            
        
    }
}
