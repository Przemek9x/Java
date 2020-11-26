package zadanie24;
import javax.swing.JOptionPane;

public class Zadanie24
{
    public static void main(String[] args)
    {
        String name1, name2;
        
        name1 = JOptionPane.showInputDialog("Podaj pierwsze imię");
        name2 = JOptionPane.showInputDialog("Podaj drugie imię");
        
        if (name1.compareTo(name2) == 0)
            JOptionPane.showMessageDialog(null, "Imiona są tej samej długości");
        else if (name1.compareTo(name2) < 0)
            JOptionPane.showMessageDialog(null, "Pierwsze imię jest krótsze od drugiego.");
        else
            JOptionPane.showMessageDialog(null, "Pierwsze imię jest dłuższe od drugiego.");   
    }
}

