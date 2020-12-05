package zadanie47;
import javax.swing.JOptionPane;

public class Zadanie47
{
    public static void main(String[] args)
    {
        String str,zawodnik1, zawodnik2, zawodnik3;
        double czas1, czas2, czas3;
        
        zawodnik1 = JOptionPane.showInputDialog("Podaj imię zawodnika");
        str = JOptionPane.showInputDialog("Podaj czas zawodnika w minutach");
        czas1 = Double.parseDouble(str);
        
        zawodnik2 = JOptionPane.showInputDialog("Podaj imię zawodnika");
        str = JOptionPane.showInputDialog("Podaj czas zawodnika w minutach");
        czas2 = Double.parseDouble(str);
        
        zawodnik3 = JOptionPane.showInputDialog("Podaj imię zawodnika");
        str = JOptionPane.showInputDialog("Podaj czas zawodnika w minutach");
        czas3 = Double.parseDouble(str);
        
        if (czas1 < czas2 && czas2 < czas3)
            JOptionPane.showMessageDialog(null, String.format("I. %s\nII. %s\nIII. %s", zawodnik1,zawodnik2,zawodnik3)); // 1 2 3
        else if (czas2 < czas1 && czas1 < czas3)
            JOptionPane.showMessageDialog(null, String.format("I. %s\nII. %s\nIII. %s", zawodnik2,zawodnik1,zawodnik3)); // 2 1 3
        else if (czas3 < czas1 && czas1 < czas2)
            JOptionPane.showMessageDialog(null, String.format("I. %s\nII. %s\nIII. %s", zawodnik3,zawodnik1,zawodnik2)); // 3 1 2
        else if (czas2 < czas3 && czas3 < czas1)
            JOptionPane.showMessageDialog(null, String.format("I. %s\nII. %s\nIII. %s", zawodnik2,zawodnik3,zawodnik1)); // 2 3 1
        else if (czas3 < czas2 && czas2 < czas1)
            JOptionPane.showMessageDialog(null, String.format("I. %s\nII. %s\nIII. %s", zawodnik3,zawodnik2,zawodnik1)); // 3 2 1 
        else 
            JOptionPane.showMessageDialog(null, String.format("I. %s\nII. %s\nIII. %s", zawodnik1,zawodnik3,zawodnik2)); // 3 2 1 
    }
}
