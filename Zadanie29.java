package zadanie29;
import javax.swing.JOptionPane;


public class Zadanie29
{
    public static void main(String[] args)
    {
        String input;
        input = JOptionPane.showInputDialog("Podaj pore roku");
        
        switch (input)
        {
            case "wiosna":
            case "Wiosna":
                JOptionPane.showMessageDialog(null, "Wiosenka");
                break;
            case "lato":
            case "Lato":
                JOptionPane.showMessageDialog(null, "Latko");
                break;
            case "jesień":
            case "Jesień":
                JOptionPane.showMessageDialog(null, "Złota jesień");
                break;
            case "zima":
            case "Zima":
                JOptionPane.showMessageDialog(null, "Ziiimaaaaaa");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Podaj własciwą pore roku.");
                break; 
        }
                
    }
}
