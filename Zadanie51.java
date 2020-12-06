package zadanie51;
import javax.swing.JOptionPane;

public class Zadanie51
{
    public static void main(String[] args)
    {
        int bookNumber, points;
        String str;
        
        str = JOptionPane.showInputDialog("Podaj liczbę książek zakupionych w tym miesiącu");
        bookNumber = Integer.parseInt(str);
        
        switch (bookNumber)
        {
            case 0:
                points = 0;
                JOptionPane.showMessageDialog(null, String.format("Posiadasz %d punktów", points));
            case 1:
                points = 5;
                JOptionPane.showMessageDialog(null, String.format("Posiadasz %d punktów", points));
            case 2:
                points = 15;
                JOptionPane.showMessageDialog(null, String.format("Posiadasz %d punktów", points));
            case 3:
                points = 30;
                JOptionPane.showMessageDialog(null, String.format("Posiadasz %d punktów", points));
            default:
                points = 60;
                JOptionPane.showMessageDialog(null, String.format("Posiadasz %d punktów", points));
        }
    }
}


